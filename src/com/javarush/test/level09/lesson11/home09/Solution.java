package com.javarush.test.level09.lesson11.home09;




/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        String [] catsNames = {"Tom", "Sam", "Gendalf", "Mike", "Mark", "Marry", "Sarah", "Bob", "Jain", "Leyla"};
        Map<String, Cat> catsMap = new HashMap<String, Cat>();
        for (int i = 0; i<10; i++){
            catsMap.put(catsNames[i], new Cat(catsNames[i]));
        }
        return catsMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {

        //Set<Cat> set = new HashSet<Cat>(map.values());

        //напишите тут ваш код
        Set<Cat> catsSet = new HashSet<Cat>();
        for (Map.Entry<String, Cat> el : map.entrySet()){
            catsSet.add(el.getValue());
        }
        return catsSet;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat " + this.name;
        }
    }


}
