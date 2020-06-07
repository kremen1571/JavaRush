package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            int j = 0;
            for (j = 0; j < (i + 1); j++) {
                System.out.print("8");
            }
            System.out.println(" ");
        }
    }
}
