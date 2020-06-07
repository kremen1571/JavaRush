package com.javarush.task.task04.task0416;

import java.io.*;
/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        double x;
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        x = Double.parseDouble(str = br.readLine());
        while (x >= 0 ) {
            if (x >= 0 && x < 3) {
                System.out.println("зелёный");
                break;
            } else if (x >= 3 && x < 4) {
                System.out.println("жёлтый");
               break;
            } else if (x >= 4 && x < 5) {
                System.out.println("красный");
                break;
            }
            else {
                x -= 5;
            }
        }
    }
}