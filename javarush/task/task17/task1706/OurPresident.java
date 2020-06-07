package com.javarush.task.task17.task1706;

public class OurPresident {
    private static OurPresident president;

   static {
       president = new OurPresident();
       synchronized (president) {
       }
   }

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}
