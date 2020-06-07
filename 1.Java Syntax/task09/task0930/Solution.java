package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        try {
            ArrayList<Integer> arrayInt = new ArrayList<>();
            ArrayList<String> arrayString = new ArrayList<>();
            ArrayList<Boolean> arrayBoolean = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                if(isNumber(array[i])) {
                    arrayInt.add(Integer.parseInt(array[i]));
                    arrayBoolean.add(true);
                }
                else {
                    arrayString.add(array[i]);
                    arrayBoolean.add(false);
                }
            }
            int count = 1;
            while (count != 0) {
                count = 0;
                for (int i = 0; i < arrayString.size() - 1; i++) {
                    if (isGreaterThan(arrayString.get(i), arrayString.get(i + 1))) {
                        Collections.swap(arrayString, i, i + 1);
                        count++;
                    }
                }
            }
            count = 1;
            while (count != 0) {
                count = 0;
                for (int i = 0; i < arrayInt.size() - 1; i++) {
                    if (arrayInt.get(i)< arrayInt.get(i + 1)) {
                        Collections.swap(arrayInt, i, i + 1);
                        count++;
                    }
                }
            }
            int j = 0, k = 0;
            for (int i = 0; i < arrayBoolean.size(); i++) {
                if (arrayBoolean.get(i)) {
                    array[i] = Integer.toString(arrayInt.get(j));
                    j++;
                }
                else  {array[i] = arrayString.get(k);
                k++;}

            }
            
            
            
            
            
            
            
            
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
    }


    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
