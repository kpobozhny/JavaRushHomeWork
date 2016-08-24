package com.javarush.test.level13.lesson02.task07;

/* Параметризованый интерфейс
В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        System.out.println(new StringObject().getInstance().toString());
    }

    interface SimpleObject<T>
    {
        SimpleObject<T> getInstance();
    }

    static class StringObject implements SimpleObject<String>//допишите здесь ваш код
    {

        public SimpleObject<String> getInstance(){
            //SimpleObject<String> s = new StringObject();
            return this;
        };
    }
}
