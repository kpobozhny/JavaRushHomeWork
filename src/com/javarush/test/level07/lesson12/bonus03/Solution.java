package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    //sorting from the highest to the lowest
    public static void sort(int[] arr)
    {
        int x;
           for (int i=0;i<(arr.length);i++){
            for (int j=0;j<(arr.length-i-1);j++){

                if(arr[j]<arr[j+1]){
                    x=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=x;
                }
            }
        }
    }
}
