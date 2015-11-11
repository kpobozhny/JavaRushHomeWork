package com.javarush.test.level04.lesson16.home04;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        String [] data = new String[4];

        for (int i=0; i<4;i++)
        data[i] = buffReader.readLine() ;

        System.out.println("Меня зовут " + data[0]);
        System.out.println("Я родился " + data[3] + "." + data[2] + "."+ data[1]);
    }
}
