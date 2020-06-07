package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] a = new int[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int a1[] = new int[10];
        int a2[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            if (i < a.length / 2) {
                a1[i] = a[i];
            }
            else { int j = i - a.length / 2;
                a2[j] = a[i];
                System.out.println(a2[j]);
            }
        }
    }
}
