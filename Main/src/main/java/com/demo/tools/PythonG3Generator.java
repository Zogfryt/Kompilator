package com.demo.tools;

import com.demo.lexerAndParser.PythonG3BaseVisitor;
import com.demo.lexerAndParser.PythonG3Parser;

import java.io.*;
import java.util.HashMap;

public class PythonG3Generator extends PythonG3BaseVisitor<String> {
    private PrintWriter writer;
    private HashMap<String,Type> values;


    public PythonG3Generator(String path) throws IOException {
        FileManager manager = new FileManager();
        writer = manager.createPrintWriterToGivenFile(path);
        values = new HashMap<>();
    }

    @Override
    public String visitFile_input(PythonG3Parser.File_inputContext ctx)
    {
        writer.println("int main() {");
        for(var child : ctx.children)
        {
            visit(child);
        }
        writer.println("return 0;");
        writer.println("}");
        writer.close();
        return null;
    }

}
