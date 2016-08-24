package com.javarush.test.level12.lesson09.task03;

/* Fly, Move, Eat для классов Dog, Car, Duck, Airplane
Есть public интерфейсы Fly(летать), Move(передвигаться), Eat(есть).
Добавь эти интерфейсы классам Dog(собака), Car(автомобиль), Duck(утка), Airplane(самолет).
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public interface Fly
    {
        public void fly();
    }

    public interface Move
    {
        public void move();
    }

    public interface Eat
    {
        public void eat();
    }

    public class Dog implements Move, Eat
    {
        public void move(){
            System.out.println("dog moves");
        }
        public void eat(){
            System.out.println("dog eats");
        }
/*        public void fly(){
            System.out.println("dog flies");
        }*/
    }

    public class Duck implements Move, Eat, Fly
    {
        public void move(){
            System.out.println("duck moves");
        }
        public void eat(){
            System.out.println("duck eats");
        }
        public void fly(){
            System.out.println("duck flies");
        }
    }

    public class Car implements Move
    {
        public void move(){
            System.out.println("car moves");
        }
/*        public void eat(){
            System.out.println("car eats");
        }
        public void fly(){
            System.out.println("car flies");
        }*/
    }

    public class Airplane implements Fly, Move
    {
        public void move(){
            System.out.println("airplane moves");
        }
/*        public void eat(){
            System.out.println("airplane eats");
        }*/
        public void fly(){
            System.out.println("airplane flies");
        }
    }
}
