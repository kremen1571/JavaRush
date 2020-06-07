package com.javarush.task.task17.task1721;

import javax.print.attribute.standard.NumberUp;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();
    static String line;

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
            String name_1 = br.readLine();
            String name_2 = br.readLine();
            FileReader fr = new FileReader(name_1);
            BufferedReader f_br = new BufferedReader(fr);
            line = null;
            while ((line = f_br.readLine()) != null) {
                allLines.add(line);
            }
            fr = new FileReader((name_2));
            f_br = new BufferedReader(fr);
            line = null;
            while ((line = f_br.readLine()) != null) {
                forRemoveLines.add(line);
            }
            new Solution().joinData();
        }
        catch (FileNotFoundException x) {

        }
        catch (IOException e) {

        }


    }

    public   void joinData() throws CorruptedDataException {
        int i;
        for (i = 0; i < forRemoveLines.size(); i++) {
            if (allLines.contains(forRemoveLines.get(i))) {
                allLines.remove(i);
            }
            else break;
        }
            if (i < forRemoveLines.size()) {
                allLines.clear();
                throw new CorruptedDataException();
            }
            }
        }


