package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

import org.w3c.dom.ls.LSOutput;

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        // напишите тут ваш код
        if (abs(a - 10) > abs(b - 10)) {
            System.out.println(b);
        } else System.out.println(a);
    }
    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}