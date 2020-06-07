package com.javarush.task.task12.task1232;

/* 
Нужно добавить в программу новую функциональность
*/

//import com.sun.org.apache.bcel.internal.generic.IFLE;

public class Solution {
    public static void main(String[] args) {
        Pegasus horse = new Pegasus();
    }

    public static interface CanFly {
        public abstract void  fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly {
        @Override
        public void fly() {

        }
    }
}
