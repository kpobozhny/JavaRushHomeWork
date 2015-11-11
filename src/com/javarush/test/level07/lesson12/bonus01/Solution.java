package com.javarush.test.level07.lesson12.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача:  Программа вводит с клавиатуры данные про котов и выводит их на экран. Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20
*/

public class Solution
{
    public final static ArrayList<Cat> CATS = new ArrayList<Cat>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s, name="";
        int age= 0,weight= 0,tailLength= 0,counter = 0;

        while(true){

            s = reader.readLine();
            if (s.isEmpty()) break;
            switch (counter%4)
            {
                case 0:  name = s;break;
                case 1:  age = Integer.parseInt(s);break;
                case 2:  weight = Integer.parseInt(s);break;
                case 3:  tailLength = Integer.parseInt(s);

                    break;
            }
            if (counter%4 == 3){
                Cat cat = new Cat(name,age,weight,tailLength);
                CATS.add(cat);
            }

            counter++;
        }

        printList();
    }

    public static void printList() {
        for (int i = 0; i < CATS.size(); i++)
        {
            System.out.println(CATS.get(i));
        }
    }

    public static class Cat
    {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name, int age, int weight, int tailLength)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString()
        {
            return "Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
        }
    }
}
