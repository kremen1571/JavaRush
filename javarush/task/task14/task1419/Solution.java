package com.javarush.task.task14.task1419;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            int[] i = new int[0];
            i[2] = 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            exceptions.get(10);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String a = null;
            System.out.println(a.charAt(0));
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int num = Integer.parseInt ("akki") ;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            BigDecimal x = new BigDecimal(1);
            BigDecimal y = new BigDecimal(3);
            x = x.divide(y);
        } catch (Exception e) {
            exceptions.add(new IllegalArgumentException());
        }
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                br.close();
                br.readLine();
        } catch (Exception e) {
            exceptions.add(e);
        }
        Exception e1 = new ArrayStoreException();
        exceptions.add(e1);
        exceptions.add(new ClassCastException());
    }
}
