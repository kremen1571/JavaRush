package com.javarush.task.task09.task0929;

/* 
Обогатим код функциональностью!
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        boolean x = false;
        int i = 0;
        while (!x)
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            i++;
            String sourceFileName = reader.readLine();
            InputStream fileInputStream = getInputStream(sourceFileName);
            String destinationFileName = reader.readLine();
            OutputStream fileOutputStream = getOutputStream(destinationFileName);

            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }
            fileInputStream.close();
            fileOutputStream.close();

            break;
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Файл не существует.");
            if (i > 1) {
                break;
            }
            continue;
        }


}

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

