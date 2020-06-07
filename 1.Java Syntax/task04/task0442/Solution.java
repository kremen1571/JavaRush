package com.javarush.task.task04.task0442;

import java.io.*;
/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
            Boolean x = true;
            int sum = 0;
            while (x) {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int num = Integer.parseInt(br.readLine());
                sum = sum + num;
                if (num == -1)
                    x = false;
            }
            System.out.println(sum);
    }
}
