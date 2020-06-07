package com.javarush.task.task18.task1823;



import java.io.*;
import java.util.*;
import java.io.FileInputStream;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while (true) {
            fileName = br.readLine();
            if (fileName.equals("exit")) {
                break;
            }
            else {
                (new ReadThread(fileName)).start();
            }
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) throws IOException {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {

            try {
            FileInputStream fs = new FileInputStream(fileName);
            byte[] b = new byte[fs.available()];
            while (fs.available() > 0) {
                fs.read(b);
            }
            fs.close();
            List<Byte> replay = new ArrayList<>();
            TreeMap<Integer, Integer>  map = new TreeMap<>();
                for (int i = 0; i < b.length; i++) {
                    int count = 0;
                    if (!replay.contains(b[i])) {
                        for (int j = 0; j < b.length; j++) {
                            if (b[i] == b[j]) {
                                count++;
                            }
                        }
                        replay.add(b[i]);
                        map.put(count, (int)(b[i]));
                    }
                }
                resultMap.put(fileName,  map.get( map.lastKey()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
