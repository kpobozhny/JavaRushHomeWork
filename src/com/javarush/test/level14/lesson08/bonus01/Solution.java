package com.javarush.test.level14.lesson08.bonus01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        //Add your code here

        try{

             Class.forName("com.javarush.test.level14.lesson08.bonus01.Solution").getField("adc");


        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try{

            Class c = Class.forName("FooClass");


        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try{

            List list = new ArrayList();
            list.add("one");

            Integer i = (Integer)list.iterator().next();

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try{

/*            Set sampleSet = new HashSet();
            sampleSet.iterator().next();*/

            List<Integer> list = new ArrayList<Integer>();
            list.iterator().next();

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try{

            List<Integer> list = new ArrayList<Integer>();
            Integer i = list.get(0);

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try{
            Character.toChars(-4);

        } catch (Exception e)
        {
            exceptions.add(e);
        }


        try{
            BufferedReader br = new BufferedReader(new FileReader("F://files"));
        } catch (Exception e)
        {
            exceptions.add(e);
        }


        try {
            String[] array1= {"qwee","dsf"};
            String s = array1[3];

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try {
            String s=null;
            s.contains("a");

        } catch (Exception e)
        {
            exceptions.add(e);
        }

    }
}
