package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/
import java.lang.StackTraceElement;
public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        StackTraceElement[] e = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : e) {
//            System.out.println(element.getClassName());
//            System.out.println(element.getMethodName());
        }
        System.out.println(e[2].getClassName() + ":");
        System.out.print(e[2].getMethodName());
        System.out.println(": " + s);
    }
}
