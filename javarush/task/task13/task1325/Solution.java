package com.javarush.task.task13.task1325;

/* 
Компиляция программы
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        String getColor();
    }

    public abstract static class Fox implements Animal {
        public abstract String getName();
    }

    public static class BigFox extends Fox {

        @Override
        public String getName() {
            return "his;";
        }


        @Override
        public String getColor() {
            return "this";

        }


    }

}