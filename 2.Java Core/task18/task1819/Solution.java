package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import javax.swing.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name1 = br.readLine();
        String name2 = br.readLine();
        FileInputStream fis1 = new FileInputStream(name1);
        byte[] buff1 = new byte[fis1.available()];
        while (fis1.available() > 0) {
            fis1.read(buff1);
        }
        FileOutputStream fos = new FileOutputStream(name1);
        FileInputStream fis2 = new FileInputStream(name2);
        byte[] buff2 = new byte[fis2.available()];
        while (fis2.available() > 0) {
            fis2.read(buff2);
            fos.write(buff2);
        }
    fos.write(buff1);
    br.close();
    fis1.close();
    fis2.close();
    fos.close();


    }
}
