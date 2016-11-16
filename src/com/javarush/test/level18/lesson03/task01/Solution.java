package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis= new FileInputStream(reader.readLine());
        int max=0, data=0;
        while (fis.available()>0){
            data=fis.read();
            if (data>max) max=data;
        }
        System.out.println(max);
        fis.close();
    }
}