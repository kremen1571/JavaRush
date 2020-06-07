package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader abr = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bbr = new BufferedReader(new InputStreamReader(System.in));
        String astr, bstr;
        astr = abr.readLine();
        bstr = bbr.readLine();
        int a = Integer.parseInt(astr);
        int b = Integer.parseInt(bstr);
        if (a > 0 && b > 0)
            System.out.println('1');
        else if (a < 0 && b > 0)
            System.out.println('2');
        else if (a < 0 && b < 0)
            System.out.println('3');
        else
            System.out.println('4');
    }
}
