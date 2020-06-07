package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        

        // напишите тут ваш код
        ArrayList<Integer> countList = new ArrayList<Integer>();
        for (int i = 0; i < 33; i++)
             countList.add(0);
        
        String str;
        char c;
        int indexOfChar;
        int value;
        for (int i = 0; i < list.size(); i++) {
            str = list.get(i);
            for (int k = 0; k < str.length(); k++) {
                c = str.charAt(k);
                if (c >= 'а' && c <= 'я') {
                    indexOfChar = alphabet.indexOf(c);
                    value = countList.get(indexOfChar) + 1;
                    countList.set(indexOfChar, value);
                }
            }
        }
        for (int i = 0; i < countList.size(); i++){
            System.out.println(alphabet.get(i) + " " + countList.get(i));
        }
    }
}
