package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
      /*  if (str < '0" || str > '7') {
            System.out.println("такого дня недели не существует");
        }*/
        String res;
        switch (str) {
            case "1":
                res = "понедельник";
                break;
            case "2":
                res = "вторник";
                break;
            case "3":
                res = "среда";
                break;
            case "4":
                res = "четверг";
                break;
            case "5":
                res = "пятница";
                break;
            case "6":
                res = "суббота";
                break;
            case "7":
                res = "воскресенье";
                break;
            default:
                res = "такого дня недели не существует";

        }
                 System.out.println(res);
        }
}