package com.demo.tools;

import java.io.*;

public class FileManager {

    public PrintWriter createPrintWriterToGivenFile(String path) throws IOException {
        File out = manageFile(path);
        FileWriter subwriter = new FileWriter(out);
        return new PrintWriter(subwriter);
    }

    private File manageFile(String path) throws IOException {
        File out = new File(path);
        if(out.exists())
        {
            deleteFile(out);
        }
        createNewFile(out);
        return out;
    }

    private void deleteFile(File out) throws InterruptedIOException {
        if(!out.delete())
        {
            throw new InterruptedIOException("Connot delete file to create output");
        }
    }
    private void createNewFile(File out) throws IOException {
        if(!out.createNewFile())
        {
            throw new InterruptedIOException("Cannot create new file");
        }
    }
}
