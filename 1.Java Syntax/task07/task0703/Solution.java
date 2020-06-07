package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String [] str = new String[2];
        int [] a = new int[2];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < str.length; i++) {
            str[i] = br.readLine();
            a[i] = str[i].length();
            System.out.println(a[i]);
        }

    }
}
