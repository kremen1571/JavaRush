package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов

1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. меньше либо равно нулю или больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int b;
        while(!str.equals("exit")) {
            if (str.indexOf('.') != -1) {
                try {
                    print(Double.parseDouble(str));
                } catch (Exception w) {
                    print(str);
                }
            } else {
                try {
                    b = Byte.parseByte(str);
                    if (b > 0 && b < 128)
                        print(Byte.parseByte(str));
                    else throw new Exception();
                } catch (Exception e) {
                    try {
                        print(Integer.parseInt(str));
                    } catch (Exception r) {
                        print(str);
                    }
                }
            }
            str = br.readLine();
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
