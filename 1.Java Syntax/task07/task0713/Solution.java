package com.javarush.task.task07.task0713;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list6 = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        int x;
        for (int i = 0; i < list.size(); i++) {
            x = list.get(i);
            if (x % 3 == 0)
                list3.add(x);
            if (x % 2 == 0)
                list2.add(x);
            if (x % 3 != 0 && x % 2 != 0)
                list6.add(x);
        }
        printList(list3);
        printList(list2);
        printList(list6);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer x : list) {
            System.out.println(x);
        }
    }
}
