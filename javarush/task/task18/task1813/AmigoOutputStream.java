package com.javarush.task.task18.task1813;

import java.io.*;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    FileOutputStream fos;
    AmigoOutputStream (FileOutputStream fos) throws IOException {
        super(fos.getFD());
        this.fos = fos;
    }

    @Override
    public void flush() throws IOException {
        fos.flush();
    }

    @Override
    public void write(int b) throws IOException {
        fos.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        fos.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fos.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        fos.flush();
        StringBuilder sb = new StringBuilder();
        sb.append("JavaRush © All rights reserved.");
        String data = sb.toString();
        write(data.getBytes());
        fos.close();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
