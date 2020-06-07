package com.javarush.task.task17.task1707;

public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        //add your code here - добавь код тут
        if (imf == null)
            imf = new IMF();
        synchronized (imf) {

        }
        return imf;
    }
    private IMF() {
    }
}