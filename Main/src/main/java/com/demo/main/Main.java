package com.demo.main;
import com.demo.lexerAndParser.PythonG3Lexer;
import com.demo.lexerAndParser.PythonG3Parser;
import com.demo.tools.FileManager;
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
        if (args.length != 1 || !args[0].endsWith(".py"))
        {
            LOGGER.log(Level.INFO,"Usage: java -jar PyCpp [path to source file .py]");
            return;
        }
        String arg = args[0];
        try{
            CharStream input = CharStreams.fromFileName(arg);
            PythonG3Lexer lexer = new PythonG3Lexer(input);
            CommonTokenStream stream = new CommonTokenStream(lexer);

            PythonG3Parser parser = new PythonG3Parser(stream);
            PythonG3Parser.File_inputContext fileInput = parser.file_input();

            String argCpp = FileManager.ChangeSuffixToCpp(arg);
            PythonG3Generator gen = new PythonG3Generator(argCpp);
            gen.visit(fileInput);

            LOGGER.log(Level.INFO,"Done");
        }
        catch (IOException e)
        {
            LOGGER.log(Level.INFO,e.getMessage());
        }
    }
}
