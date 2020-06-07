package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name1 = br.readLine();
        String name2 = br.readLine();
        String name3 = br.readLine();
        FileInputStream fs2 = new FileInputStream(name2);
        FileInputStream fs3 = new FileInputStream(name3);
        FileOutputStream fos = new FileOutputStream(name1);
        byte[] bf2 = new byte[fs2.available()];
        byte[] bf3 = new byte[fs3.available()];
        int count2 = 0;
        while (fs2.available() > 0){
            count2 = fs2.read(bf2);
            fos.write(bf2,0, count2);
        }
        int count3 = 0;
        while (fs3.available() > 0) {
            count3 = fs3.read(bf3);
            fos.write(bf3, 0, count3);
        }
        fs2.close();
        fs3.close();
        fos.close();
        br.close();
    }
}
