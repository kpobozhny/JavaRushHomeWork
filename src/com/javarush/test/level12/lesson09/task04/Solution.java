package com.javarush.test.level12.lesson09.task04;

/* Fly, Run, Swim для классов Human, Duck, Penguin, Airplane
Есть public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
Добавь эти интерфейсы классам Human(человек), Duck(утка), Penguin(пингвин), Airplane(самолет).
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

    public interface Run
    {
        public void run();
    }

    public interface Swim
    {
        public void swim();
    }


    public class Human implements Run, Swim
    {
        public void run(){
            System.out.println("human runs");
        }
       public void swim(){
            System.out.println("human swims");
        }

    }

    public class Duck implements  Swim, Fly, Run
    {
        public void run(){
            System.out.println("duck runs");
        }
        public void swim(){
            System.out.println("duck swims");
        }
        public void fly(){
            System.out.println("duck flies");
        }
    }

    public class Penguin implements  Swim, Run
    {
        public void run(){
            System.out.println("penguin runs");
        }
        public void swim(){
            System.out.println("penguin swims");
        }
    }

    public class Airplane implements  Fly, Run
    {
        public void fly(){
            System.out.println("airplane flies");
        }
        public void run(){
            System.out.println("airplane runs");
        }

    }
}
