package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fs = null;
        String filename = null;
        try {
            while (true) {
                filename = br.readLine();
                fs = new FileInputStream(filename);
                fs.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(filename);
            br.close();
        }
    }
}
