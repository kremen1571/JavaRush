package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        str = br.readLine();
        int num = Integer.parseInt(str);
        if (num > 0) {
            num = num * 2;
            System.out.println(num);
        }
        else if (num < 0) {
            num = num +1;
            System.out.println(num);
        }
        else
            System.out.println(0);
    }
}