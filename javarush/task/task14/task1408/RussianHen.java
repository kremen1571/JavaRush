package com.javarush.task.task14.task1408;

public class RussianHen extends Hen  implements  Country {
    @Override
    public int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

//    @Override
//    public String toString() {
//        return super.toString() + ;
//    }
}
