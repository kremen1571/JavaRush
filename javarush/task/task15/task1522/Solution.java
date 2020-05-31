package com.javarush.task.task15.task1522;

/* 
Закрепляем паттерн Singleton
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        try {
            for (int i = 0; i < 3; i++) {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String str = br.readLine();
                if (str.equals(Planet.SUN)) {
                    thePlanet = Sun.getInstance();
                } else if (str.equals(Planet.EARTH)) {
                    thePlanet = Earth.getInstance();
                } else if (str.equals(Planet.MOON)) {
                    thePlanet = Moon.getInstance();
                } else {
                    thePlanet = null;
                }
            }
            } catch(IOException e){
                System.out.println("Smth inputed wrong");
            }
        }
    }
