package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String nameFile = br.readLine();
            BufferedWriter bw = new BufferedWriter(new FileWriter(nameFile));

//                    bw.write(line)
            boolean x = true;
            String str;
            int c;
            while (x) {
                str = br.readLine();
                bw.write(str);
                bw.write('\n');
                if (str.equals("exit")) {
                    x = false;
                    break;
                }
            }
            br.close();
            bw.close();
        }
        catch (IOException e) {}
        finally {

        }
    }


}
