package com.javarush.task.task18.task1803;

/* 
Самые частые байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fs = new FileInputStream(br.readLine());
        br.close();
        List<Integer> list = new ArrayList<>();
        List<Integer> listmax = new ArrayList<>();
        List<Integer> listsymbol = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        while (fs.available() > 0)
            list.add(fs.read());
        fs.close();
        int count;
        int maxcount = 0;
        for (int j = 0; j < list.size(); j++) {
            count = 0;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(j).equals(list.get(i))) {
                    count++;
                }
            }
            if (count >= maxcount) {
                maxcount = count;
                listmax.add(maxcount);
                listsymbol.add(list.get(j));
                set.add(list.get(j));
            }
        }
        count = 0;
        maxcount = listmax.get((listmax.size() - 1));

        /*for (int i = 0; i < listsymbol.size(); i++) {
            if (listmax.get(i).equals(maxcount)) {
                if (count > 0)
                    System.out.print(" ");
                        System.out.print(listsymbol.get(i));
                        count++;
                }
            }*/
        Iterator value = set.iterator();

        while (value.hasNext()) {
            System.out.print(value.next() + " ");
        }
    }
    }

