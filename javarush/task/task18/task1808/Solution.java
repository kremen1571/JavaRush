package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();
        String file3 = br.readLine();
        FileInputStream fs = new FileInputStream(file1);
        FileOutputStream fosFile2 = new FileOutputStream(file2);
        FileOutputStream fosFile3 = new FileOutputStream(file3);
        int count = fs.available();
        int countforfile2;
        if (count % 2 != 0) {
            countforfile2 = count / 2 + 1;
        }
        else {
            countforfile2 = count / 2;
        }
        if (fs.available() > 0) {
            byte[] bf = new byte[count];
            count = fs.read(bf);
            fosFile2.write(bf, 0, countforfile2);
            fosFile3.write(bf, countforfile2, count - countforfile2);
        }
        fosFile2.close();
        fosFile3.close();
        fs.close();
        br.close();
    }
}
