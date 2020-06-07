package com.javarush.task.task16.task1630;

//import jdk.jfr.StackTrace;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //add your code here - добавьте код тут
    static {
        try {
           firstFileName = br.readLine();
           secondFileName = br.readLine();
        }
        catch (IOException e){
            System.out.println(e.fillInStackTrace());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {

        String str = "";
        String rl = "";
        private String fullFileName;
        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return str;
        }

        @Override
        public void run() {
            try {
                FileInputStream f = new FileInputStream(this.fullFileName);
                BufferedReader br = new BufferedReader(new InputStreamReader(f));
                while ((rl = br.readLine()) != null) {
                    if (str.equals(""))
                        str = str + rl;
                    else str = str + " " + rl;
                }
            }
            catch (IOException ex) {
            }
        }
    }
}
