package com.javarush.task.task04.task0420;
import java.io.*;
import java.util.*;
/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int [3];
        String str1, str2,str3;
        a[0] = Integer.parseInt(str1 = br1.readLine());
        a[1] = Integer.parseInt(str2 = br2.readLine());
        a[2] = Integer.parseInt(str3 = br3.readLine());
        for (int i = 0; i < 3; i++) {
            int minInd = i;
            for (int j = 0; j < 3; j++) {
                if (a[i] <= a[j]) {
                    minInd = j;
                }
            }
            int temp = a[i];
            a[i] = a[minInd];
            a[minInd] = temp;
            }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
            }
            }
