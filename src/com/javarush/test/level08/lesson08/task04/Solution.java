package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stalonne", new Date("JUNE 1 1980"));
        map.put("John", new Date("MAY 1 1984"));
        map.put("Max", new Date("DECEMBER 1 1980"));
        map.put("Sam", new Date("JUNE 1 1980"));
        map.put("Tom", new Date("JULY 1 1980"));
        map.put("Brad", new Date("JUNE 1 1980"));
        map.put("Luck", new Date("JULY 1 1980"));
        map.put("Kostya", new Date("JUNE 1 1980"));
        map.put("Peet", new Date("JULY 1 1980"));
        map.put("Creige", new Date("JULY 1 1980"));
        //Напишите тут ваш код

        return map;

    }

    public  static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Date workDate = new Date();
        int month;
        HashMap<String, Date> tempMap = new HashMap<String, Date>();
        for (Map.Entry<String, Date> elem: map.entrySet()){
            workDate = elem.getValue();
            month = workDate.getMonth();
            if (month > 4 &  month < 8 ){
                tempMap.put(elem.getKey(), elem.getValue());

            }

        }

        for (Map.Entry<String, Date> elem: tempMap.entrySet()){

            map.remove(elem.getKey());

        }


    }

    public static void main(String [] args)
    {


        HashMap<String, Date> myMap = createMap();
        System.out.println(myMap);
        removeAllSummerPeople(myMap);
        System.out.println(myMap);
    }
}
