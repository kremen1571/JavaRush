package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] a = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < a.length; i++ ) {
            a[i] = Integer.parseInt(br.readLine());
        }
        for(int i = (a.length - 1); i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}

