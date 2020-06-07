package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name1 = br.readLine();
        String name2 = br.readLine();
        FileInputStream fs = new FileInputStream(name1);
        FileOutputStream fos = new FileOutputStream(name2);
        if (fs.available() > 0) {
            byte[] bf = new byte[fs.available()];
            int count = fs.read(bf);
            for (int i = count - 1; i >= 0; i--) {
                fos.write(bf[i]);
            }
        }
        br.close();
        fs.close();
        fos.close();
    }
}
