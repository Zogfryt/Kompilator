package com.demo.tools;

import com.demo.lexerAndParser.PythonG3Parser;
import org.antlr.v4.runtime.tree.TerminalNode;

class ChildFinder {
    static TerminalNode getSignIncrement(PythonG3Parser.Increment_statementContext ctx)
    {
        if(ctx.INCREASE_ADD() != null)
        {
            return ctx.INCREASE_ADD();
        }
        else if (ctx.INCREASE_MULTIPLY() != null)
        {
            return ctx.INCREASE_MULTIPLY();
        }
        else if (ctx.DECREASE_DIVISION() != null)
        {
            return ctx.DECREASE_DIVISION();
        }
        else if (ctx.DECREASE_MODULO() != null)
        {
            return ctx.DECREASE_MODULO();
        }
        else if (ctx.DECREASE_SUBSTRACT() != null)
        {
            return ctx.DECREASE_SUBSTRACT();
        }
        else
        {
            throw new IllegalArgumentException("");
        }
    }
}
