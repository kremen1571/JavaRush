package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    private int top;
    private int left;
    private int width;
    private int height;

    public Rectangle(int top) {
        this.top = top;
        this.left = top;
        this.width = top;
        this.height = top;
    }
    public Rectangle (int top, int left) {
        this.top = top;
        this.left = left;
        this.width = top;
        this.height = left;
    }
    public Rectangle (int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public Rectangle (int left, int width, int height) {
        this.top = 50;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public static void main(String[] args) {

    }
}
