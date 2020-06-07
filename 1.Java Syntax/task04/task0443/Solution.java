package com.javarush.task.task04.task0443;
import java.io.*;
/* 
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bry = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader brm = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader brd = new BufferedReader(new InputStreamReader(System.in));
        String name = bry.readLine();
        int y = Integer.parseInt(bry.readLine());
        int m = Integer.parseInt(brm.readLine());
        int d = Integer.parseInt(brd.readLine());
        System.out.println("Меня зовут " + name + '.');
        System.out.println("Я родился " + d + "." + m + "." + y);
    }
}
