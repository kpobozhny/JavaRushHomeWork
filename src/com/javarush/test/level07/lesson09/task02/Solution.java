package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 5 слов в обратном порядке
Введи с клавиатуры 5 слов в список строк. Выведи их в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> listStr = new ArrayList<String>();
        for (int i=0; i < 5; i++){
            listStr.add(reader.readLine());
        }

        for (int i = 0; i < listStr.size();i++){
            System.out.println(listStr.get(listStr.size()-i-1));

        }

    }
}
