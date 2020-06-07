package com.javarush.task.task03.task0325;
import java.io.*;
/* 
Финансовые ожидания
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.SocketTimeoutException;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
           String n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = br.readLine();
        System.out.println("Я буду зарабатывать $" + n + " в час");
    }
}
