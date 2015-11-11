package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human son1 = new Human("Robert", true, 12);
        Human son2 = new Human("Teo", true, 9);
        Human son3 = new Human("Harry", true, 4);
        ArrayList<Human> heapOfChildren = new ArrayList<Human>();
        heapOfChildren.add(son1);
        heapOfChildren.add(son2);
        heapOfChildren.add(son3);
        Human father = new Human("John", true, 40, heapOfChildren);
        Human mother = new Human("Lana", false, 38, heapOfChildren);
        Human grandFather1 = new Human ("Bob", true, 61, father);
        Human grandFather2 = new Human ("Tom", true, 62, mother);
        Human grandMother1 = new Human ("Marry", false, 58, father);
        Human grandMother2 = new Human ("Gloria", false, 59, mother);

        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(son3.toString());
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;


        }

        public Human(String name, boolean sex, int age, Human child){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(child);

        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.addAll(children);

        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
