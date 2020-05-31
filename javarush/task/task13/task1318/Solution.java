package com.javarush.task.task13.task1318;                                                  
                                                                                               
                                                  
import javax.imageio.IIOException;                                                  
import java.io.BufferedReader;                                                  
import java.io.FileInputStream;                                                  
import java.io.InputStreamReader;                                                  
import java.io.*;                                                  
                                                  
public class Solution {                                                  
    public static void main(String[] args) {                                                  
        // напишите тут ваш код                                                  
        try {                                                  
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                                                  
            String name = br.readLine();                                                  
            br.close();                                                  
                                                  
            InputStream file = new FileInputStream(name);                                                  
                                                  
            while (file.available() > 0) {                                                  
                 char c = (char)file.read();                                                  
                System.out.print(c);                                                  
            }                                                  
            file.close();                                                  
        }                                                  
        catch (IOException e) {}                                                  
    }                                                  
                                                  
}