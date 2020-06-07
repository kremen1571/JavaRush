package com.javarush.task.task07.task0716;

import java.util.ArrayList;
import java.lang.String;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код

        for (int i = 0; i < strings.size(); i++) {
            int l = 0;
            int r = 0;
//            int lr = 0;
            String str = strings.get(i);

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'р') {
                    r++;
                }
                if (str.charAt(j) == 'л') {
                    l++;
                }
            }
            if (l > 0 && r > 0) {
            }
            else if (l == 0 && r > 0) {
                strings.remove(i);
                i--;
            }
            else if (l > 0 && r == 0) {
               strings.add(i, str);
               i++;
            }
        }
        return strings;
    }
}