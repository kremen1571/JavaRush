package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader abr = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bbr = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader cbr = new BufferedReader((new InputStreamReader(System.in)));
        String astr, bstr, cstr;
        astr = abr.readLine();
        bstr = bbr.readLine();
        cstr = cbr.readLine();
        int a = Integer.parseInt(astr);
        int b = Integer.parseInt(bstr);
        int c = Integer.parseInt(cstr);
        if ( a == b)
            System.out.println('3');
        else if (c == b)
            System.out.println('1');
        else if (a == c)
            System.out.println('2');
        else {}

    }
}
