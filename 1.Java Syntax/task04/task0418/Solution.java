package com.javarush.task.task04.task0418;

import java.io.*;
/* 
Минимум двух чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader ab = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
        String astr = ab.readLine();
        String bstr = bb.readLine();
        int a = Integer.parseInt(astr);
        int b = Integer.parseInt(bstr);
        if (a < b)
            System.out.println(a);
        else if (a > b) {
            System.out.println(b);
        }
        else
            System.out.println(a);
        }
    }
