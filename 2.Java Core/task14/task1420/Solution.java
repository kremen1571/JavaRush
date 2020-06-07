package com.javarush.task.task14.task1420;

/* 
НОД
*/

//import com.sun.tools.javac.comp.Resolve;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        int j = Integer.parseInt(br.readLine());
//        (i <= 0) ? "Pizda" : "Hui";
//        throw new Exception("dw");
        int max = 0;

        int opd = 0;
        for (int k = 1; k < max; k++) {
            if (i % k == 0 && j % k == 0)
                opd = k;
        }
        System.out.println(opd);
    }
}

