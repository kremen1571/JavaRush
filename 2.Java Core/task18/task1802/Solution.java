package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fr = new FileInputStream(br.readLine());
        int min = fr.read();
        int i;
        while (fr.available() > 0) {
            i = fr.read();
            if (i < min)
                min = i;
        }
        System.out.println(min);
        fr.close();
        br.close();
    }
}
