package com.javarush.task.task15.task1530;

public class LatteMaker extends DrinkMaker {

    LatteMaker(){
       makeDrink();
    }


    @Override
    void getRightCup() {
        System.out.println("Берем чашку для латте");
    }

    @Override
    void putIngredient() {
        System.out.println("Делаем кофе");
    }

    @Override
    void pour() {
        System.out.println("Заливаем молоком с пенкой");
    }


    @Override
    protected void makeDrink() {
        super.makeDrink();
    }
}
