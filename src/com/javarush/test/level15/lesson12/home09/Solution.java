package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import com.javarush.test.level15.lesson12.home07.Constants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        //add your code here
        String str;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            str=reader.readLine().split("\\?")[1];
            Map<String, String> strMap = new HashMap<>();
            String[] strAr = str.split("\\&");
            for (int i=0;i<strAr.length;i++){


                if (strAr[i].split("=").length>1){
                    strMap.put(strAr[i].split("=")[0],strAr[i].split("=")[1]);
                } else strMap.put(strAr[i].split("=")[0],null);

            }

            for(Map.Entry<String, String> e: strMap.entrySet()){
                System.out.print(e.getKey());
                System.out.print(" ");
            }
            System.out.println();
            for(Map.Entry<String, String> e: strMap.entrySet()){
                if (e.getKey().equals("obj")){
                    try{
                        alert(Double.parseDouble(e.getValue()));
                    } catch (NumberFormatException ex){
                        alert(e.getValue());
                    }


                }
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
