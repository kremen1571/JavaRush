package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.RUSSIA);
        hen.getCountOfEggsPerMonth();
        System.out.println(HenFactory.getHen(Country.RUSSIA).getDescription());
    }

    static class HenFactory implements  Country {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            if (country.equals("Russia"))
                hen = new RussianHen();
            else if (country.equals(UKRAINE))
                hen = new UkrainianHen();
            else if (country.equals((BELARUS)))
                hen = new BelarusianHen();
            else if (country.equals(MOLDOVA))
                hen = new MoldovanHen();
            return hen;
        }
    }


}
