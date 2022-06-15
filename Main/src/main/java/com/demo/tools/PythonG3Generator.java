package com.demo.tools;

import com.demo.lexerAndParser.PythonG3BaseVisitor;
import com.demo.lexerAndParser.PythonG3Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PythonG3Generator extends PythonG3BaseVisitor<String> {

    private static final Logger LOGGER = Logger.getLogger( PythonG3Generator.class.getName() );
    private final PrintWriter writer;
    private final HashMap<String,PythonTypes> values;
    private final String separator;
    private final HashMap<ParserRuleContext,PythonTypes> types;
    private int line;
    private int start;

    private final String Header = """
    #include <string>
    
    class Object{};
    
    class Integer: public Object
    {
    public:
        int value;
        explicit Integer(int val) : value(val){};
    };
    
    class Double: public Object
    {
    public:
        double value;
        explicit Double(double val) : value(val){};
    };
    
    class String: public Object
    {
    public:
        std::string value;
        explicit String(std::string val) : value(val){};
    };
    
    class Boolean: public Object
    {
    public:
        bool value;
        explicit Boolean(bool val) : value(val){};
    };
    
    double doubleBuffer;
    """;


    public PythonG3Generator(String path) throws IOException {
        FileManager manager = new FileManager();
        writer = manager.createPrintWriterToGivenFile(path);
        values = new HashMap<>();
        separator = System.lineSeparator();
        types = new HashMap<>();
        line = 0;
        start = 0;
    }

    @Override
    public String visitFile_input(PythonG3Parser.File_inputContext ctx)
    {
        writer.println(Header);
        writer.println("int main() {");
        writer.println();
        for(var child : ctx.children)
        {
            String temp;
            try {
                temp = visit(child);
            }
            catch (IllegalArgumentException exception)
            {
                if (!exception.getMessage().isEmpty())
                {
                    LOGGER.log(Level.INFO, exception.getMessage());
                }
                continue;
            }

            if(temp != null)
            {
                writer.print(temp);
            }
        }
        writer.println();
        for(var value : values.entrySet())
        {
            if(value.getValue() != PythonTypes.NONE)
            {
                writer.printf("delete %s;%s",value.getKey(),separator);
            }
        }
        writer.println();
        writer.println("return 0;");
        writer.println("}");
        writer.close();
        return null;
    }

    @Override
    public String visitStatement(PythonG3Parser.StatementContext ctx) {
        if(ctx.simple_statement() != null)
        {
            return visitSimple_statement(ctx.simple_statement());
        }
        else if (ctx.block_statement() != null)
        {
           return visitBlock_statement(ctx.block_statement());
        }

        throw new IllegalArgumentException("");
    }

    @Override
    public String visitSimple_statement(PythonG3Parser.Simple_statementContext ctx)
    {
        if (ctx.assign_statement() != null)
        {
            return visitAssign_statement(ctx.assign_statement());
        }
        else if (ctx.increment_statement() != null)
        {
            return visitIncrement_statement(ctx.increment_statement());
        }
        else if (ctx.BREAK() != null)
        {
            return "break;" + separator;
        }
        else if (ctx.CONTINUE() != null)
        {
            return "continue;" + separator;
        }
        else
        {
            throw new IllegalArgumentException("");
        }
    }

    @Override
    public String visitIncrement_statement(PythonG3Parser.Increment_statementContext ctx)
    {
        UpdateLineAndStart(ctx.VARIABLE().getSymbol());
        String variable = ValueBuilder.buildVariableName(ctx.VARIABLE().getText());
        if (!values.containsKey(variable))
        {
            throw new IllegalArgumentException(GenerateErrorHeader() + "Undefined Variable");
        }
        String expressionString = visitExpression(ctx.expression());
        String sign = ctx.getChild(1).getText();
        UpdateLineAndStart(ChildFinder.getSignIncrement(ctx).getSymbol());

        if(ctx.INCREASE_ADD() == null && values.get(variable) == PythonTypes.STRING && types.get(ctx.expression()) == PythonTypes.STRING)
        {
            throw new IllegalArgumentException(GenerateErrorHeader() + "Cannot use increment statement with strings (only +=)");
        }
        else if ((values.get(variable) != PythonTypes.STRING && types.get(ctx.expression()) == PythonTypes.STRING)
                || (values.get(variable) == PythonTypes.STRING && types.get(ctx.expression()) != PythonTypes.STRING))
        {
            throw new IllegalArgumentException(GenerateErrorHeader() + "Cannot use increment with string and numerical");
        }
        else if (values.get(variable) == PythonTypes.NONE || types.get(ctx.expression()) == PythonTypes.NONE)
        {
            throw new IllegalArgumentException(GenerateErrorHeader() + "Cannot increment null values");
        }

        return buildIncrement(sign, variable, expressionString, values.get(variable), types.get(ctx.expression()));
    }

    private String buildIncrement(String sign, String variable, String expression, PythonTypes variableType, PythonTypes expressionType)
    {
        if (sign.equals("%=") && expressionType == PythonTypes.FLOAT)
        {
            StringBuilder build = new StringBuilder();
            build.append("doubleBuffer = ");
            build.append(expression);
            build.append(';');
            build.append(separator);
            String left = ValueBuilder.buildVariableToUse(variable,variableType);
            String value = String.format("%s - ((int)(%s / doubleBuffer)) * doubleBuffer;",left,left);
            build.append("doubleBuffer = ");
            build.append(value);
            build.append(separator);
            if (variableType == PythonTypes.FLOAT)
            {
                build.append(ValueBuilder.buildVariableValuesChange(variable,"doubleBuffer", PythonTypes.FLOAT));
            }
            else
            {
                build.append(ValueBuilder.buildVariableTypeChange(variable,"doubleBuffer",PythonTypes.FLOAT,separator));
            }
            build.append(separator);
            return build.toString();
        }
        else return ValueBuilder.buildVariableToUse(variable,variableType) + sign + expression + ';' + separator;
    }

    @Override
    public String visitAssign_statement(PythonG3Parser.Assign_statementContext ctx)
    {
        String expression = visitExpression(ctx.expression());
        PythonTypes type = types.get(ctx.expression());
        StringBuilder build = new StringBuilder();

        for(var variable : ctx.VARIABLE())
        {
            UpdateLineAndStart(variable.getSymbol());
            String name = ValueBuilder.buildVariableName(variable.getText());
            if(!values.containsKey(name))
            {
                values.put(name, type);
                build.append(ValueBuilder.buildVariableToInitialize(name, type, expression));
            }
            else if (values.get(name) != type)
            {
                values.replace(name, type);
                build.append(ValueBuilder.buildVariableTypeChange(name,expression,type,separator));
            }
            else {
                build.append(ValueBuilder.buildVariableValuesChange(name,expression,type));
            }
            build.append(separator);
        }
        return build.toString();
    }

    @Override
    public String visitExpression(PythonG3Parser.ExpressionContext ctx)
    {
        if (ctx.CONST_OR() == null)
        {
            String temp = visitConjunction(ctx.conjunction());
            types.put(ctx,types.get(ctx.conjunction()));
            types.remove(ctx.conjunction());
            return temp;
        }
        String left = visitExpression(ctx.expression());
        String right = visitConjunction(ctx.conjunction());

        types.remove(ctx.expression());
        types.remove(ctx.conjunction());

        types.put(ctx,PythonTypes.BOOL);

        return left + "||" + right;

    }

    @Override
    public String visitConjunction(PythonG3Parser.ConjunctionContext ctx)
    {
        if (ctx.CONST_AND() == null)
        {
            String temp = visitInversion(ctx.inversion());
            types.put(ctx,types.get(ctx.inversion()));
            types.remove(ctx.inversion());
            return temp;
        }
        String left = visitConjunction(ctx.conjunction());
        String right = visitInversion(ctx.inversion());

        types.put(ctx,PythonTypes.BOOL);
        types.remove(ctx.conjunction());
        types.remove(ctx.inversion());

        return left + "&&" + right;
    }

    @Override
    public String visitInversion(PythonG3Parser.InversionContext ctx)
    {
        if (ctx.NEGATION() == null)
        {
            String temp =  visitComparative(ctx.comparative());
            types.put(ctx,types.get(ctx.comparative()));
            types.remove(ctx.comparative());
            return temp;
        }
        String temp = '!' + visitInversion(ctx.inversion());
        types.put(ctx, PythonTypes.BOOL);
        types.remove(ctx.inversion());
        return temp;
    }

    @Override
    public String visitComparative(PythonG3Parser.ComparativeContext ctx)
    {
        if(ctx.comparative_tail() == null)
        {
            String temp = visitSum(ctx.sum());
            types.put(ctx,types.get(ctx.sum()));
            types.remove(ctx.sum());
            return temp;
        }
        var l = ctx.sum();
        var r = ctx.comparative_tail();
        String left = visitSum(l);
        String right = visitComparative_tail(r);

        if ((types.get(l) == PythonTypes.STRING && types.get(r) != PythonTypes.STRING)
                || (types.get(l) != PythonTypes.STRING && types.get(r) == PythonTypes.STRING))
        {
            throw new IllegalArgumentException(GenerateErrorHeader() + "String cannot compare to other types");
        }

        if (types.get(l) == PythonTypes.NONE || types.get(r) == PythonTypes.NONE)
        {
            throw new IllegalArgumentException(GenerateErrorHeader() + "None cannot be compared");
        }

        types.put(ctx,PythonTypes.BOOL);
        types.remove(r);
        types.remove(l);


        return left + right;

    }

    @Override
    public String visitComparative_tail(PythonG3Parser.Comparative_tailContext ctx)
    {
        String temp =  visit(ctx.getChild(0));
        types.put(ctx,types.get(ctx.getChild(0)));
        types.remove(ctx.getChild(0));
        return temp;
    }

    @Override
    public String visitComparative_eq(PythonG3Parser.Comparative_eqContext ctx)
    {
        String temp = "==" + visitSum(ctx.sum());
        types.put(ctx,types.get(ctx.sum()));
        types.remove(ctx.sum());
        return temp;
    }

    @Override
    public String visitComparative_eq_less(PythonG3Parser.Comparative_eq_lessContext ctx)
    {
        String temp = "<=" + visitSum(ctx.sum());
        types.put(ctx,types.get(ctx.sum()));
        types.remove(ctx.sum());
        return temp;
    }

    @Override
    public String visitComparative_eq_more(PythonG3Parser.Comparative_eq_moreContext ctx)
    {
        String temp = ">=" + visitSum(ctx.sum());
        types.put(ctx,types.get(ctx.sum()));
        types.remove(ctx.sum());
        return temp;
    }

    @Override
    public String visitComparative_more(PythonG3Parser.Comparative_moreContext ctx)
    {
        String temp = ">" + visitSum(ctx.sum());
        types.put(ctx,types.get(ctx.sum()));
        types.remove(ctx.sum());
        return temp;
    }

    @Override
    public String visitComparative_less(PythonG3Parser.Comparative_lessContext ctx)
    {
        String temp = "<" + visitSum(ctx.sum());
        types.put(ctx,types.get(ctx.sum()));
        types.remove(ctx.sum());
        return temp;
    }

    @Override
    public String visitSum(PythonG3Parser.SumContext ctx)
    {
        if (ctx == null) throw new IllegalArgumentException("");
        if (ctx.MINUS() == null && ctx.PLUS() == null)
        {
            String temp = visitMult(ctx.mult());
            types.put(ctx,types.get(ctx.mult()));
            types.remove(ctx.mult());
            return temp;
        }

        var l = ctx.sum();
        var r = ctx.mult();
        String left = visitSum(l);
        String right = visitMult(r);

        if (types.get(l) == PythonTypes.NONE || types.get(r) == PythonTypes.NONE)
        {
            throw new IllegalArgumentException(GenerateErrorHeader() + "Cannot operate on None Values");
        }
        else if (ctx.MINUS() != null && (types.get(r) == PythonTypes.STRING || types.get(l) == PythonTypes.STRING))
        {
            throw new IllegalArgumentException(GenerateErrorHeader() + "Cannot substract Strings");
        }
        else if ((types.get(r) == PythonTypes.STRING && types.get(l) != PythonTypes.STRING) ||
                (types.get(r) != PythonTypes.STRING && types.get(l) == PythonTypes.STRING))
        {
            throw new IllegalArgumentException(GenerateErrorHeader() + "Cannot oparate on string and different type");
        }

        if (types.get(r) == PythonTypes.STRING && types.get(l) == PythonTypes.STRING)
        {
            types.put(ctx,PythonTypes.STRING);
        }
        else if (types.get(r) == PythonTypes.FLOAT || types.get(l) == PythonTypes.FLOAT)
        {
            types.put(ctx,PythonTypes.FLOAT);
        }
        else
        {
            types.put(ctx, PythonTypes.NUMERICAL);
        }

        types.remove(r);
        types.remove(l);

        char sign = ctx.MINUS() == null ? '+' : '-';
        return left + sign + right;
    }

    @Override
    public String visitMult(PythonG3Parser.MultContext ctx)
    {
        if(ctx.MULTIPLICATION() == null && ctx.DIVISION() == null)
        {
            String temp = visitAtom(ctx.atom());
            types.put(ctx,types.get(ctx.atom()));
            types.remove(ctx.atom());
            return temp;
        }

        var l = ctx.mult();
        var r = ctx.atom();
        String left = visitMult(l);
        String right = visitAtom(r);

        if(types.get(l) == PythonTypes.STRING || types.get(r) == PythonTypes.STRING)
        {
            throw new IllegalArgumentException("Cannot do division/multiplication on strings");
        }
        else if(types.get(r) == PythonTypes.NONE || types.get(l) == PythonTypes.NONE)
        {
            throw new IllegalArgumentException("Cannot use None in multiplication/division");
        }

        char sign;
        if (ctx.MULTIPLICATION() != null)
        {
            sign = '*';
        }
        else sign = ctx.DIVISION() != null ? '/' : '%';

        if (types.get(l) == PythonTypes.FLOAT || types.get(r) == PythonTypes.FLOAT)
        {
            types.put(ctx,PythonTypes.FLOAT);
        }
        else
        {
            types.put(ctx,PythonTypes.NUMERICAL);
        }

        types.remove(r);
        types.remove(l);

        if (types.get(ctx) == PythonTypes.FLOAT && sign == '%')
        {
            return String.format("(%s - ((int)(%s / %s)) * %s",left,left,right,right);
        }
        else return left + sign + right;

    }

    @Override
    public String visitAtom(PythonG3Parser.AtomContext ctx)
    {
        if(ctx.LEFT_PARENTHESIS() != null)
        {
            UpdateLineAndStart(ctx.LEFT_PARENTHESIS().getSymbol());
            String temp = '(' + visitExpression(ctx.expression()) + ')';
            types.put(ctx,types.get(ctx.expression()));
            types.remove(ctx.expression());
            return temp;
        }
        PythonTypes type = PythonTypes.NONE;
        String temp = "";
        if (ctx.FALSE() != null)
        {
            UpdateLineAndStart(ctx.FALSE().getSymbol());
            temp = "false";
            type = PythonTypes.BOOL;
        }
        else if (ctx.TRUE() != null)
        {
            UpdateLineAndStart(ctx.FALSE().getSymbol());
            temp = "true";
            type = PythonTypes.BOOL;
        }
        else if (ctx.NULL() != null)
        {
            UpdateLineAndStart(ctx.NULL().getSymbol());
            temp = "nullptr";
        }
        else if (ctx.FLOAT() != null)
        {
            UpdateLineAndStart(ctx.FLOAT().getSymbol());
            temp = ctx.FLOAT().getText();
            type = PythonTypes.FLOAT;
        }
        else if (ctx.INT() != null)
        {
            UpdateLineAndStart(ctx.INT().getSymbol());
            temp = ctx.INT().getText();
            type = PythonTypes.NUMERICAL;
        }
        else if (ctx.STRING() != null)
        {
            UpdateLineAndStart(ctx.STRING().getSymbol());
            temp = "std::string(" + ctx.STRING().getText() + ')';
            type = PythonTypes.STRING;
        }
        else if (ctx.VARIABLE() != null)
        {
            UpdateLineAndStart(ctx.VARIABLE().getSymbol());
            String variable = ValueBuilder.buildVariableName(ctx.VARIABLE().getText());
            if(values.containsKey(variable))
            {
                type = values.get(variable);
                temp = ValueBuilder.buildVariableToUse(variable,type);
            }
            else
            {
                throw new IllegalArgumentException(GenerateErrorHeader() + "Unknown variable");
            }
        }
        else
        {
            throw new IllegalArgumentException("");
        }
        types.put(ctx,type);
        return temp;
    }

    private String GenerateErrorHeader()
    {
        return "line " + line + ';' + start + " : ";
    }

    private void UpdateLineAndStart(Token tk)
    {
        line = tk.getLine();
        start = tk.getStartIndex();
    }





}
