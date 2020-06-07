package com.javarush.task.task04.task0414;

    import java.io.*;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String str;
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        str = br.readLine();
        int i = Integer.parseInt(str);
        if (i % 400 == 0) {
            System.out.println("количество дней в году: 366");
        }
        else if (i % 100 == 0)
            System.out.println("количество дней в году: 365");
        else if (i % 4 == 0) {
            System.out.println("количество дней в году: 366");
        }
        else {
            System.out.println("количество дней в году: 365");
        }
    }
}