package com.demo.tools;

import java.io.*;

public class FileManager {

    private File out;
    public PrintWriter createPrintWriterToGivenFile(String path) throws IOException {
        manageFile(path);
        FileWriter subwriter = new FileWriter(out);
        return new PrintWriter(subwriter);
    }

    private void manageFile(String path) throws IOException {
        out = new File(path);
        if(out.exists())
        {
            deleteFile();
        }
        createNewFile();
    }

    public void deleteFile() throws InterruptedIOException {
        if(!out.delete())
        {
            throw new InterruptedIOException("Connot delete file to create output");
        }
    }
    private void createNewFile() throws IOException {
        if(!out.createNewFile())
        {
            throw new InterruptedIOException("Cannot create new file");
        }
    }

    public static String ChangeSuffixToCpp(String path)
    {
        return path.substring(0,path.lastIndexOf('.')) + ".cpp";
    }
}
