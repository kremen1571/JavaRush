package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String nameFile = br.readLine();
            FileInputStream fs = new FileInputStream(nameFile);
            List<Integer> list = new ArrayList<>();
//            int i;
//            InputStream fs = new FileInputStream("/home/kremen/Downloads/test1.txt");
            BufferedReader digitsReader = new BufferedReader(new InputStreamReader(fs));
//            String str =digitsReader.readLine();
//             i = 0;
            while (digitsReader.ready()) {

                list.add(Integer.parseInt(digitsReader.readLine()));
//                i++;
            }
//            br.close();
            fs.close();
            Collections.sort(list);
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) % 2 == 0)
                    System.out.println(list.get(j));
            }


//            long time = System.currentTimeMillis();
//            someMethod();
//// some code
//            System.out.println(System.currentTimeMillis() - time);
        }
        catch (Exception e){}

    }
}
