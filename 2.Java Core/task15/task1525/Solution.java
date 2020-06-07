package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution extends Statics {
    public static List<String> lines = new ArrayList<String>();
    static {
        try {
            String str;
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            while ((str = br.readLine()) != null) {
                lines.add(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (Exception r){}
    }
    public static void main(String[] args) {
        System.out.println(lines);
    }
}
