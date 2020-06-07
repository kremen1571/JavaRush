package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        FileInputStream fs = new FileInputStream(filename);
        byte[] buff = new byte[fs.available()];
        while (fs.available() > 0) {
            fs.read(buff);
        }
        fs.close();
        String str = new String(buff, StandardCharsets.UTF_8);
        String[] str1 = str.split("\n");
        for (int i = 0; i < str1.length; i++) {
            String[] str2 = str1[i].split(" ");
            if (str2[0].equals(args[0])) {
                System.out.println(str1[i]);
                break;
            }
        }
    }
}

