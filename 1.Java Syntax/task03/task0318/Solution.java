package com.javarush.task.task03.task0318;
import java.io.*;
/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры
        String name = bufferedReader.readLine(); //читаем строку с клавиатуры

        int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.
        System.out.println(name + " захватит мир через " + sAge + " лет. Му-ха-ха!");
    }
}
