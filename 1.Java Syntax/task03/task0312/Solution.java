package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    //напишите тут ваш код
    public static int convertToSeconds(int hour) {
        int sec = hour * 3600;
        return sec;
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        int hour = 3;
    System.out.println(convertToSeconds(hour));
    System.out.println(convertToSeconds(20));
    }
}
