package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

import java.security.PublicKey;

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public Circle () {
        this(10, 5, 15);
    }
    public Circle (double x, double y) {
        this(x, y, 10);
    }
    public Circle (double radius) {
        this(10,10, radius);
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y =  y;
        this.radius = radius;
    }
    public static void main(String[] args) {

    }
}