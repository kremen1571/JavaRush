package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fs = new FileInputStream(args[0]);
       int [] b = new int [fs.available()];
        for (int i = 0; fs.available() > 0; i++) {
            b[i] = fs.read();
        }
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] >= 97 && b[i] <= 122 || b[i] >= 65 && b[i] <= 90) {
                count++;
            }
        }
        System.out.println(count);
        fs.close();
    }
}
