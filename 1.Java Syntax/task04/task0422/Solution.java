package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        String str1, str2;
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        str1 = br1.readLine();
        int vozrast = Integer.parseInt(br2.readLine());
        if (vozrast < 18)
            System.out.println("Подрасти еще");
        else {}
    }
}
