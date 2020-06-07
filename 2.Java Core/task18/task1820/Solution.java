package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();
        br.close();
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);
        byte[] b = new byte[fis.available()];
        while (fis.available() > 0) {
            fis.read(b);
        }
        String str = new String(b);
        String[] strsplit = str.split(" ");
        for (int i = 0; i < strsplit.length; i++) {
            String finalstr =  Math.round((Double.parseDouble(strsplit[i]))) + " ";
            fos.write(finalstr.getBytes());
        }
        fos.close();
        fis.close();
    }
}
