package com.demo.main;
import com.demo.lexerAndParser.PythonG3Lexer;
import com.demo.lexerAndParser.PythonG3Parser;
import com.demo.tools.PythonG3Generator;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger( Main.class.getName() );
    public static void main(String[] args){
        try{
            CharStream input = CharStreams.fromFileName("C:\\Users\\FiFi\\Kompilator\\Main\\src\\main\\source\\test.py");
            PythonG3Lexer lexer = new PythonG3Lexer(input);
            CommonTokenStream stream = new CommonTokenStream(lexer);

            PythonG3Parser parser = new PythonG3Parser(stream);
            PythonG3Parser.File_inputContext fileInput = parser.file_input();

            PythonG3Generator gen = new PythonG3Generator("C:\\Users\\FiFi\\Kompilator\\Main\\src\\main\\source\\test.cpp");
            gen.visit(fileInput);

            LOGGER.log(Level.INFO,"Done");
        }
        catch (IOException e)
        {
            LOGGER.log(Level.INFO,e.getMessage());
        }
    }
}
