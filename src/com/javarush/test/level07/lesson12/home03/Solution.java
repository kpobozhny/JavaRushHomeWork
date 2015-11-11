package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[20];

        for (int i=0; i < arr.length; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println(maxOfArray(arr)+" "+minOfArray(arr));

    }

    public static int maxOfArray(int[] arr){
        int max = arr[0];
        for (int elem : arr){
            if (elem > max) max=elem;
        }

        return max;
    }

    public static int minOfArray(int[] arr){
        int min = arr[0];
        for (int elem : arr){
            if (elem < min) min=elem;
        }

        return min;
    }
}
