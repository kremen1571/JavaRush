package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        br.close();
        FileInputStream fs = new FileInputStream(name);
        List<Integer> list = new ArrayList<>();
        while (fs.available() > 0) {
            list.add(fs.read());
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(44)) {
                count++;
            }
        }
        System.out.println(count);
        fs.close();
    }
}
