package com.javarush.test.level13.lesson06.task01;

/* Dog, Cat и Mouse
1. Создать классы Dog, Cat и Mouse.
2. Реализовать интерфейсы в добавленных классах, учитывая что:
- Кот(Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
- Мышь(Mouse) может передвигаться и может быть съедена.
- Собака(Dog) может передвигаться и съесть кого-то.
*/

public class Solution
{

     interface Moveable //может двигаться
    {
        void move();
    }

     interface Eatable  //может быть съеден
    {
        void eaten();
    }

     interface Eat  //может кого-нибудь съесть
    {
        void eat();
    }

    class Cat implements Moveable, Eatable, Eat{
        public void move(){
            System.out.println("move");
        }

        public void eaten(){
            System.out.println("eaten");
        }

        public void eat(){
            System.out.println("eat");
        }
    }

    class Mouse implements Moveable, Eatable{
        public void move(){
            System.out.println("move");
        }

        public void eaten(){
            System.out.println("eaten");
        }

    }

    class Dog implements Moveable, Eat{
        public void move(){
            System.out.println("move");
        }


        public void eat(){
            System.out.println("eat");
        }
    }
}
