package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/
import java.lang.StackTraceElement;

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return  (ste[2].getLineNumber());

    }

    public static int method2() {
        method3();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return  (ste[2].getLineNumber());    }

    public static int method3() {
        method4();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return  (ste[2].getLineNumber());    }

    public static int method4() {
        method5();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        int i = ste[2].getLineNumber();
        System.out.println(i);
        return  (i);    }

    public static int method5() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return  (ste[2].getLineNumber());    }
}
