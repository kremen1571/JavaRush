package com.javarush.task.task04.task0439;
import java.io.*;
/*
Письмо счастья
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(str +  " любит меня.");
        }

    }
}