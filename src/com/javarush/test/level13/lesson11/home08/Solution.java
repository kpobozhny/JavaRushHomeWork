package com.javarush.test.level13.lesson11.home08;

/* Интерфейс Updatable в классе Screen
Реализовать интерфейс Updatable в классе Screen.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
    }

    interface Selectable
    {
        void onSelect();
    }

    interface Updatable extends Selectable
    {
        void refresh();
    }

    class Screen implements Updatable
    {
        public void onSelect(){
            System.out.println("123");
        }
        public void refresh(){System.out.println("456");}

    }
}
