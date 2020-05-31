package com.javarush.task.task15.task1529;

/* 
Осваивание статического блока
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            if (str.equals("helicopter")) {
                result = new Helicopter();
            }
            else if (str.equals("plane")) {

                int countPass = Integer.parseInt(br.readLine());
                result = new Plane(countPass);
            }
            else throw new Exception();

            br.close();
        }
        catch (Exception e){
            System.out.println("Pizda proge");
        }
    }
}
