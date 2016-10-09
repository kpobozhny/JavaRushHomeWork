package com.javarush.test.level15.lesson12.home01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<String>();
        String stringBox;
        while (true){
            stringBox= reader.readLine();
            if (stringBox.equals("exit")) break;
            list.add(stringBox);
        }
        for(String s: list){
            int i;
            try{
                i = Integer.parseInt(s);
                if (0<i && i<128) print((short)i);
                else print(i);
            } catch (NumberFormatException e){
                //e.printStackTrace();
                if (s.contains(".")) {
                    Double d = Double.parseDouble(s);
                    print(d);
                }
                else print(s);
            }
/*            if (s.contains(".")) print(2.2);
            else if (s>0)*/
        }

        reader.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
