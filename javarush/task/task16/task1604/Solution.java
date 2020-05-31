package com.javarush.task.task16.task1604;

/* 
Вывод стек-трейса
*/

import static java.lang.Thread.currentThread;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

//        System.out.println("*****************");


    }
    public static class SpecialThread implements Runnable {

        @Override
        public  void run() {
            for (StackTraceElement element : currentThread().getStackTrace()) {
                System.out.println(element);
            }
        }
    }
    }

