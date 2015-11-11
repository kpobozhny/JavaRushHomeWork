package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a, b, c;
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(buffReader.readLine());
        b = Integer.parseInt(buffReader.readLine());
        c = Integer.parseInt(buffReader.readLine());
        if (a >= b)
        {
            if (b >= c)
            {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            } else
            {
                if (c >= a)
                {
                    System.out.println(c);
                    System.out.println(a);
                    System.out.println(b);
                } else
                {
                    System.out.println(a);
                    System.out.println(c);
                    System.out.println(b);
                }

            }

        } else if (b >= c)
        {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else
        {
            if (c >= b)
            {
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            } else
            {
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
            }

        }


    }
}
