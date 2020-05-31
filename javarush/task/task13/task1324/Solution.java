package com.javarush.task.task13.task1324;

/* 
Один метод в классе
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public  interface Animal {
       abstract String getColor();
       abstract Integer getAge();
    }

    public abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
