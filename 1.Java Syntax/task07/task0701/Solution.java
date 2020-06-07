package com.javarush.task.task07.task0701;
import java.io.*;
import java.io.*;
import java.lang.reflect.Array;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int [] a = new int[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        return a;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int a[];
        a = array;
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= max)
                max = a[i];
        }

        return max;
    }
}
