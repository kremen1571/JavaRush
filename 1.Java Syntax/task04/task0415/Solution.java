package com.javarush.task.task04.task0415;

import java.io.*;
/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String astr, bstr, cstr;
        BufferedReader abr = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bbr = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader cbr = new BufferedReader(new InputStreamReader(System.in));
        astr = abr.readLine();
        bstr = bbr.readLine();
        cstr = cbr.readLine();
        int a = Integer.parseInt(astr);
        int b = Integer.parseInt(bstr);
        int c = Integer.parseInt(cstr);
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник существует.");
        }
        else {
            System.out.println("Треугольник не существует.");
        }
    }
}