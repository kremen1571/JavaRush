package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> children1 = new ArrayList<Human>();
        Human child1 = new Human("сын1", true, 25);
        Human child2 = new Human("сын2", true, 24);
        Human child3 = new Human("сын3", true, 26);
        children1.addAll(Arrays.asList(child1, child2, child3));
        Human father = new Human("father3", true, 50, children1);
        Human mother = new Human("mother", false, 50, children1);

        ArrayList<Human> children2 = new ArrayList<Human>();
        ArrayList<Human> children3 = new ArrayList<Human>();

        children2.add(father);
        children3.add(mother);
        Human gfather1 = new Human("gfather1", true, 70,children2);
        Human gmother1 = new Human("gmother1", false, 70, children2);

        Human gfather2 = new Human("gfather1", true, 70, children3);
        Human gmother2 = new Human("gmother1", false, 70, children3);


        ArrayList<Human> list = new ArrayList<>();
        list.addAll(Arrays.asList(gfather1, gfather2, gmother1, gmother2, father, mother, child1, child2, child3));
        for (Human all: list) {
            System.out.println(all);
        }
    }

    public static class Human {
        //напишите тут ваш код
        String  name;
         boolean sex;
         int     age;
         ArrayList<Human> children = new ArrayList<Human>();
        Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        Human(String name, boolean sex, int age, ArrayList<Human> child) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.addAll(child);
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
