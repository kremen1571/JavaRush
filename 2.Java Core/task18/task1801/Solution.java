package com.javarush.task.task18.task1801;

/* 
Максимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte b;
        FileInputStream fr = new FileInputStream(br.readLine());
        int max = fr.read();
        int j;
        while (fr.available() > 0) {
            j = fr.read();
            if (j > max) {
                max = j;
            }
        }
        fr.close();
        System.out.println(max);
    }
}
