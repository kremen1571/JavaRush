package com.javarush.task.task06.task0614;
//import java.util.ArrayList;
/* 
Статические коты
*/

import java.util.ArrayList;

public class Cat {
    //напишите тут ваш код
//    public static Cat cats;
    public static ArrayList<Cat> cats = new ArrayList<Cat>();
    String name;
    public Cat(){
    }

    public static void main(String[] args) {
        //напишите тут ваш код
       for (int i = 0; i < 10; i++) {
        Cat cat = new Cat();
        cats.add(cat);
        }
        printCats();
    }

    public static void printCats() {
        for (Cat cat: cats)
            System.out.println(cat);
        //напишите тут ваш код
    }
}
