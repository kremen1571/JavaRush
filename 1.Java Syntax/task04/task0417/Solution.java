package com.javarush.task.task04.task0417;

import java.io.*;
/* 
Существует ли пара?
*/

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
        if ( a == b && a == c)
            System.out.println(a + " " + b + " " + c);
        else if (a == b)
            System.out.println(a + " "  + b);
        else if (a == c)
            System.out.println(a + " " + c);
        else if (b == c)
            System.out.println(b + " " + c);
        else {

        }

    }
}