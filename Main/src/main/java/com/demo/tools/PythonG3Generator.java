package com.demo.tools;

import com.demo.lexerAndParser.PythonG3BaseVisitor;
import com.demo.lexerAndParser.PythonG3Parser;
import com.demo.main.Main;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PythonG3Generator extends PythonG3BaseVisitor<String> {

    private static final Logger LOGGER = Logger.getLogger( Main.class.getName() );
    private PrintWriter writer;
    private HashMap<String,Type> values;
    private String separator;
    private Type currentExpressionOverralType;
    private HashMap<ParserRuleContext,PythonTypes> types;


    public PythonG3Generator(String path) throws IOException {
        FileManager manager = new FileManager();
        writer = manager.createPrintWriterToGivenFile(path);
        values = new HashMap<>();
        separator = System.getProperty("file.separator");
        types = new HashMap<>();
    }

    @Override
    public String visitFile_input(PythonG3Parser.File_inputContext ctx)
    {
        writer.println("int main() {");
        for(var child : ctx.children)
        {
            writer.print(visit(child));
        }
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

        throw new IllegalArgumentException("Error in visitStatement");
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
            throw new IllegalArgumentException("Error in SimpleStatement");
        }
    }

    @Override
    public String visitIncrement_statement(PythonG3Parser.Increment_statementContext ctx)
    {
        if (!values.containsKey(ctx.VARIABLE().getText()))
        {
            LOGGER.log(Level.INFO,"Undefined variable");
            return "";
        }
        return ctx.VARIABLE().getText() + ctx.children.get(1).getText() + visit(ctx.children.get(2));
    }

    @Override
    public String visitExpression(PythonG3Parser.ExpressionContext ctx)
    {
        if (ctx.CONST_OR() != null)
        {
            return visitConjunction(ctx.conjunction());
        }
        String left = visitExpression(ctx.expression());
        String right = visitConjunction(ctx.conjunction());

        return left + "||" + right;

    }

    @Override
    public String visitConjunction(PythonG3Parser.ConjunctionContext ctx)
    {
        if (ctx.CONST_AND() != null)
        {
            return visitInversion(ctx.inversion());
        }
        String left = visitConjunction(ctx.conjunction());
        String right = visitInversion(ctx.inversion());

        return left + "&&" + right;
    }

    @Override
    public String visitInversion(PythonG3Parser.InversionContext ctx)
    {
        if (ctx.NEGATION() != null)
        {
            return visitComparative(ctx.comparative());
        }
        return '!' + visitInversion(ctx.inversion());
    }

    public String visitComparative(PythonG3Parser.ComparativeContext ctx)
    {
        if(ctx.comparative_tail() != null)
        {
            return visitSum(ctx.sum());
        }
        var l = ctx.sum();
        var r = ctx.comparative_tail();
        String left = visitSum(l);
        String right = visitComparative_tail(r);
        return null; //nie zwracaj uwagi to tylko by commit przeszedł
    }


}
