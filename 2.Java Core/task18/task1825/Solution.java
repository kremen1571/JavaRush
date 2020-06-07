package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        int count = 0;
        String outputFileName = null;
        boolean bool = true;
        try {
            while (true) {
                String filename = br.readLine();
                if (filename.equals("end"))
                    break;
                while (bool) {
                    String[] tempstr = filename.split("\\.");
                    outputFileName = tempstr[0] + "." + tempstr[1];
                    bool = false;
                }
                map.put(filename, count);
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            //System.out.println(key);
            //System.out.println(outputFileName);
            //System.out.println();
            try {
                FileInputStream fs = new FileInputStream(key);
                FileOutputStream fos = new FileOutputStream(outputFileName, true);
                int c = 0;
                byte[] buff = new byte[fs.available()];
                while (fs.available() > 0) {
                    c = fs.read(buff);
                    fos.write(buff );
                }
                fs.close();
                fos.close();
            } catch (FileNotFoundException fnf) {
                fnf.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
