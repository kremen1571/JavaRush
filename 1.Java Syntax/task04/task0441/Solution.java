package com.javarush.task.task04.task0441;
import java.io.*;
/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int [3];
        a[0] = Integer.parseInt(br1.readLine());
        a[1] = Integer.parseInt(br2.readLine());
        a[2] = Integer.parseInt(br3.readLine());
        int i = 0;
        if (a[i] == a[i + 1] && a[i] == a[i+2])
            System.out.println(a[i]);
        else if (a[i] == a[i + 1])
            System.out.println(a[i]);
        else if (a[i] == a[i + 2])
            System.out.println(a[i]);
        else if (a[i + 1] == a[i + 2])
            System.out.println(a[i + 1]);
        else {
            int min = a[0];
            for (i = 0; i < a.length; i++) {
                if (min > a[i])
                    min = a[i];
            }
            int count = 0;
            for (i = 0; a[i] != min; i++) {
                count++;
            }
            i = 0;
            if (count == 0) {
                if (a[i + 1] < a[i + 2])
                    System.out.println(a[i + 1]);
                else {
                    System.out.println(a[i + 2]);
                }
            } else if (count == 1) {
                if (a[i] < a[i + 2])
                    System.out.println(a[i]);
                else
                    System.out.println(a[i + 2]);
            } else {
                if (a[i] < a[i + 1])
                    System.out.println(a[i]);
                else System.out.println(a[i + 1]);
            }
        }
    }
}

