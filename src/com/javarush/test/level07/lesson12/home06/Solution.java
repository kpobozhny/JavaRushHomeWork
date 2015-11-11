package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandFather1 = new Human("Пётр", true, 60);
        Human grandFather2 = new Human("Василий", true, 56);
        Human grandMother1 = new Human("Ирина", false, 52);
        Human grandMother2 = new Human("Мария", false, 51);
        Human Father = new Human ("Костя", true, 32, grandFather1, grandMother1);
        Human Mother = new Human ("Лина", false, 25, grandFather2, grandMother2);
        Human Son1 = new Human ("Захар", true, 4, Father, Mother);
        Human Son2 = new Human ("Андрей", true, 4, Father, Mother);
        Human Daughter1 = new Human ("Анна", false, 2, Father, Mother);

        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(Father.toString());
        System.out.println(Mother.toString());
        System.out.println(Son1.toString());
        System.out.println(Son2.toString());
        System.out.println(Daughter1.toString());

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;


        public Human(        String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        public Human(        String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
