package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{

    public static int minOfTwo(int a, int b){

        return a<b?a:b;
    }

    public static void main(String[] args) throws Exception
    {
        int a, b;
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(buffReader.readLine());
        b = Integer.parseInt(buffReader.readLine());
        System.out.println(minOfTwo(a,b));

        /* данные для тестирования:
        введите 1 и 2, минимум =  1
        введите 2 и 1, минимум =  1
        введите 1 и 1, минимум =  1
        введите -1 и -2, минимум =  -2
         */
    }
}