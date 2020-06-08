package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String crUDFileName = br.readLine();
            if (args.length < 1)
                return;
            switch (args[0]) {
                case "-u": {
                    if (args.length < 5)
                        return;
                    String replaceStr = String.format("%-8s%-30s%-8s%-4s", args[1], args[2], args[3], args[4]);
                    u_method(crUDFileName, args[1], replaceStr);
                }
                    break;
                case "-d": d_method(crUDFileName, args[1]);
                    break;
                default:
                    return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void u_method (String crUDFileName, String id, String replaceStr) throws IOException{
        int index;
        byte[] buff;
        String[] crUDMass = parsecrUDfileName(crUDFileName);
        index = searchID(crUDMass, id);
        if (index == -5)
            System.exit(0);
        crUDMass[index] = replaceStr;
        FileOutputStream fos = new FileOutputStream(crUDFileName);
        for (int i = 0; i < crUDMass.length; i++) {
            buff = new byte[crUDMass[i].length()];
            buff = crUDMass[i].getBytes();
            fos.write(buff);
            fos.write('\n');
        }
        fos.close();
    }

    public static void d_method(String crUDFileName, String id) throws IOException{
        int index;
        byte[] buff;
        String crUDMass[] = parsecrUDfileName(crUDFileName);
        index = searchID(crUDMass, id);
        if (index == -5)
            System.exit(0);
        FileOutputStream fos = new FileOutputStream(crUDFileName);
        for (int i = 0; i < crUDMass.length; i++) {
            if (i != index) {
                buff = new byte[crUDMass[i].length()];
                buff = crUDMass[i].getBytes();
                fos.write(buff);
                fos.write('\n');
            }
        }
        fos.close();
    }

    public static String[] parsecrUDfileName(String crUDFileName) {
        String crUDMass[] = null;
        try {
            FileInputStream fs = new FileInputStream(crUDFileName);
            byte[] buff = new byte[fs.available()];
            while (fs.available() > 0) {
               fs.read(buff);
            }
            fs.close();
            String bufftostring = new String(buff);
            crUDMass = bufftostring.split("\n");
        } catch (IOException x) {
            x.printStackTrace();
        }
        return crUDMass;
    }

    public static int searchID (String[] crUDMass, String id) {
        int index = -5;
        for (int i = 0; i < crUDMass.length; i++) {
            String sub = crUDMass[i].substring(0, 8);
            if (sub.trim().equals(id.trim())) {
                index = i;
                break;
            }
        }
        return index;
    }
}
