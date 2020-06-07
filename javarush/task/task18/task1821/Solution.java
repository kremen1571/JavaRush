package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        byte[] b = new byte[fis.available()];
        while (fis.available() > 0) {
            fis.read(b);
        }
        fis.close();
        Map<Byte, Integer> treeMap = new TreeMap<>();
        List<Byte> added = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            int count = 0;
            if (!added.contains(b[i])) {
                for (int j = 0; j < b.length; j++) {
                    if (b[i] == b[j]) {
                        count++;
                    }
                }
                added.add(b[i]);
                treeMap.put(b[i], count);
                //System.out.println(count + " " + (char) (b[i]));
            }
        }
        Iterator<Map.Entry<Byte, Integer>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Byte, Integer> pair = iterator.next();
            Byte key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println((char)((byte)key) + " " + value);
        }
    }
}
