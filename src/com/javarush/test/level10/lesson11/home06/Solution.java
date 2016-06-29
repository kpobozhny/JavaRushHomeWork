package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        int age;
        Date dateOfBirth;
        String name;
        char sex;
        Human mother;
        Human father;

        public Human(){ this.dateOfBirth=new Date();}

        public Human(int age){
            this.age=age;
        }

        public Human(int age, Date dateOfBirth){
            this.age=age;
            this.dateOfBirth=dateOfBirth;
        }

        public Human(int age, Date dateOfBirth, String name){
            this.age=age;
            this.dateOfBirth=dateOfBirth;
            this.name=name;
        }

        public Human(int age, Date dateOfBirth, String name, char sex){
            this.age=age;
            this.dateOfBirth=dateOfBirth;
            this.name=name;
            this.sex=sex;
        }

        public Human(int age, Date dateOfBirth, String name, char sex, Human mother){
            this.age=age;
            this.dateOfBirth=dateOfBirth;
            this.name=name;
            this.sex=sex;
            this.mother=mother;
        }

        public Human(int age, Date dateOfBirth, String name, char sex, Human mother, Human father){
            this.age=age;
            this.dateOfBirth=dateOfBirth;
            this.name=name;
            this.sex=sex;
            this.mother=mother;
            this.father=father;
        }

        public Human(Human mother, Human father){
            this.mother=mother;
            this.father=father;
        }

        public Human( String name){

            this.dateOfBirth=new Date();
            this.name=name;

        }


        public Human( char sex){

            this.dateOfBirth=new Date();
            this.sex=sex;

        }

    }
}
