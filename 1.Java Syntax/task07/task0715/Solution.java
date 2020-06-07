package com.javarush.task.task07.task0715;
import java.util.Collection;
/* 
Продолжаем мыть раму
*/

import java.util.ArrayList;
import java.util.Collection;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        for (int i = 1; i < 6; i += 2) {
            list.add(i, "именно");
        }
        for (String s: list) {
            System.out.println(s);
        }
    }
}
