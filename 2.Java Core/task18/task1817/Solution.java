package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;

import static java.lang.StrictMath.PI;

public class Solution {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileInputStream fis = new FileInputStream(args[0]);
        double csymbol = fis.available();
        double cspace = 0;
        while (fis.available() > 0) {
            if (fis.read() == 32) {
                cspace++;
            }
        }
        DecimalFormat df = new DecimalFormat("#.##");
        if (csymbol != 0)
            System.out.println(df.format(cspace / csymbol * 100));
    fis.close();
    }
}
