package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> mapNames = new HashMap<String, String>();
        mapNames.put("Pobozhny", "Kostya");
        mapNames.put("Stepanov", "Andrey");
        mapNames.put("Ara", "Sam");
        mapNames.put("Pitt", "Brad");
        mapNames.put("Joly", "Angy");
        mapNames.put("Arthur", "James");
        mapNames.put("Brandon", "Sam");
        mapNames.put("Chack", "Anna");
        mapNames.put("Dierkes", "Lothar");
        mapNames.put("Ru", "Mag");

        return mapNames;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int counter = 0;
        for (Map.Entry<String, String> elem: map.entrySet()){
        if (elem.getValue() == name){
            counter++;
        }

    }

        return counter;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int counter1 = 0;
        for (Map.Entry<String, String> elem : map.entrySet())
        {
            if (elem.getKey() == familiya)
            {
                counter1++;
            }



        }
        return counter1;
    }
}
