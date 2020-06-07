package com.javarush.task.task07.task0702;

/* 
Массив из строчек в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String [] str = new String[10];
        BufferedReader strbr = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            str[i] = strbr.readLine();
        }
        for (int i = 9; i >= 0; i-- )
            System.out.println(str[i]);
    }
}