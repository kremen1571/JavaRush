package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
        String str1, str2,str3, str4;
        int[] a = new int [4];
        a[0]= Integer.parseInt(br1.readLine());
        a[1] = Integer.parseInt(br2.readLine());
        a[2] = Integer.parseInt(br3.readLine());
        a[3] = Integer.parseInt(br4.readLine());
        int i = 0;
        int max = a[0];
        while (i < 4) {
            if (max < a[i]) {
                max = a[i];
            }
            i++;
            }
        System.out.println(max);
        }
    }

