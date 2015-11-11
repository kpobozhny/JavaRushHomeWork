package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> listStr = new ArrayList<String>();
        for (int i=0; i < 5; i++){
            listStr.add(reader.readLine());
        }
        String temp;
        for (int i=0; i < listStr.size()/2; i++){
            temp = listStr.get(i);
            listStr.set(i,listStr.get(listStr.size()-i-1));
            listStr.set(listStr.size()-i-1, temp);
        }

        for (int i=0; i < listStr.size(); i++){
            System.out.println(listStr.get(i));
        }

    }
}
