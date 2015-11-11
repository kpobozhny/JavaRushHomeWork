package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;
import java.util.Random;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //Написать тут ваш код
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] l = {5,2,4,7,0};
        for (int i = 0; i < l.length; i++){
            //add new element to ArrayList
            list.add(new int[l[i]]);
            //fill array, created on the previous step
            for (int k =0; k < list.get(i).length; k++)
            {

                list.get(i)[k] = (int) (Math.random() * 100);
            }
        }

        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);

            }
            //System.out.println();
        }
    }
}
