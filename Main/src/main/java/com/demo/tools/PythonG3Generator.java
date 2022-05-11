package com.demo.tools;

import com.demo.lexerAndParser.PythonG3BaseListener;
import com.demo.lexerAndParser.PythonG3Parser;

import java.io.*;
import java.util.HashMap;

public class PythonG3Generator extends PythonG3BaseListener {
    private PrintWriter writer;


    public PythonG3Generator(String path) throws IOException {
        FileManager manager = new FileManager();
        writer = manager.createPrintWriterToGivenFile(path);
    }

    @Override
    public void enterFile_input(PythonG3Parser.File_inputContext ctx)
    {
        writer.println("int main() {");
    }

    @Override
    public void exitFile_input(PythonG3Parser.File_inputContext ctx)
    {
        writer.println("return 0;");
        writer.println("}");
        writer.close();
    }

}
