package com.javarush.task.task04.task0436;
import java.io.*;
/* 
Рисуем прямоугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br1.readLine());
        int n = Integer.parseInt(br2.readLine());
        for (int i = 0; i < m; i++) {
            int j = 0;
            for (; j < n; j++) {
                System.out.print("8");
            }
            System.out.println(" ");
        }

    }
}
