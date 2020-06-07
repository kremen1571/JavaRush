package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] a = new int[15];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int odd = 0;
        int even = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(br.readLine());
            if (i % 2 == 0 || i == 0)
                odd += a[i];
            else even += a[i];
        }
        if (odd > even)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
