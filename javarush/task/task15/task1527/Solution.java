package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String urls = br.readLine();
        URL url= new URL(urls);
        String[] str = (url.getQuery().split("&"));
        int index = 0;
        String dbl;
        for (int k = 0; k < str.length; k++) {
            if ((index = str[k].indexOf("=")) != -1) {
                System.out.print((str[k].substring(0, index)) + " ");
            }
            else if (index == -1)
                System.out.print (str[k] + " ");
        }
        System.out.println();
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("obj")) {
                index =  str[i].indexOf('=');
                if (index != -1) {
                    dbl = str[i].substring(index + 1);
                    try {
                        alert(Double.parseDouble(dbl));
                    }
                    catch (Exception e) {
                        alert(dbl);
                    }
                }
            }
        }
    }
    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
