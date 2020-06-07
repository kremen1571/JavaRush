package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import javax.annotation.processing.SupportedSourceVersion;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String str1, str2;
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        str1 = br1.readLine();
        str2 = br2.readLine();
        if (str1.equals(str2))
            System.out.println("Имена идентичны");
        else if (str1.length() == str2.length())
            System.out.println("Длины имен равны");
        else{}

    }
}
