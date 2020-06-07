package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fs = new FileInputStream(br.readLine());
        br.close();
        List<Integer> list = new ArrayList<>();
        while (fs.available() > 0) {
            list.add(fs.read());
        }
        fs.close();
        Collections.sort(list);
        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
        for (int i = 0; i < newList.size(); i++) {
            System.out.print(newList.get(i) + " ");
        }
    }
}
