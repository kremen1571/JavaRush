package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(456));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int i = 0;
        int sum = 0;
        char c;
        String str = number + "";
        char arr[] = str.toCharArray();
        while(i < (str.length())) {
            sum =  sum + (arr[i] - '0');
            i++;
        }
        return sum;
    }
}