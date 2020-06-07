package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
        }
        int x, y;
        x = (list.get(0)).length();
        for (int i = 0; i < list.size(); i++) {
            y = (list.get(i)).length();
            if (y >= x)
                x = (list.get(i)).length();
            else {
                System.out.println(i);
               break;
            }
        }
    }
}

