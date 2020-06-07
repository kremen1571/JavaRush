package com.javarush.task.task09.task0905;
import java.lang.StackTraceElement;
/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        //напишите тут ваш код
        StackTraceElement[] e = Thread.currentThread().getStackTrace();
        int deep = 0;
        for (StackTraceElement element: e) {
            deep++;
        }
        System.out.println(deep);
        return (deep);
    }
}

