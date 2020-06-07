package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fs = new FileInputStream(br.readLine());
        List<Integer> list = new ArrayList<>();
        List<Integer> symbols = new ArrayList<>();
        List<Integer> values = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        br.close();
        while (fs.available() > 0)
            list.add(fs.read());
        fs.close();
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            if (!symbols.contains(list.get(i))) {
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(i).equals(list.get(j))) {
                        count++;
                    }
                }
                    symbols.add(list.get(i));
                    values.add(count);
            }
        }
        int min = 0;
        for (int i = 0; i < values.size() - 1; i++) {
            min = Math.min(values.get(i), values.get(i + 1));
        }
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i).equals(min)) {
                set.add(symbols.get(i));
            }
        }
        Iterator value = set.iterator();
        while (value.hasNext()) {
            System.out.print(value.next() + " ");
        }
    }
}
