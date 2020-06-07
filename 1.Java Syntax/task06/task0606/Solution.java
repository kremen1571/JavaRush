package com.javarush.task.task06.task0606;
import java.io.*;
/* 
Чётные и нечётные циферки
*/

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int y = 1;
        for (int i = 0; i < str.length(); i++ ) {
            y = 10 * y;
        }
        int x = Integer.parseInt(str);
        y = y / 10;
        for (int i = 0; i < str.length(); i++) {
            if ((x / y) % 2 == 0) {
                even++;
            }
            else {odd++;}
            y /= 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
