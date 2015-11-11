package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{

    public static int maxOfTwo(int a, int b){

        return a>b?a:b;
    }

    public static void main(String[] args) throws Exception
    {
        int a, b;
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(buffReader.readLine());
        b = Integer.parseInt(buffReader.readLine());
        b=maxOfTwo(a, b);
        a = Integer.parseInt(buffReader.readLine());
        b=maxOfTwo(a, b);
        a = Integer.parseInt(buffReader.readLine());
        System.out.println(maxOfTwo(a,b));

    }
}
