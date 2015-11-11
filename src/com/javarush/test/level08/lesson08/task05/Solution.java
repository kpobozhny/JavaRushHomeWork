package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> mapNames = new HashMap<String, String>();
        mapNames.put("Pobozhny", "Kostya");
        mapNames.put("Stepanov", "Andrey");
        mapNames.put("Ara", "Anna");
        mapNames.put("Pitt", "Brad");
        mapNames.put("Joly", "Angy");
        mapNames.put("Arthur", "James");
        mapNames.put("Brandon", "Sam");
        mapNames.put("Chack", "Anna");
        mapNames.put("Dierkes", "Lothar");
        mapNames.put("Ru", "Mag");

        return mapNames;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy1 = new HashMap<String, String>(map);
        HashMap<String, String> copy2 = new HashMap<String, String>(map);
        int counter;
        for (Map.Entry<String, String> elem1: copy1.entrySet())
        {
            counter = 0;
            for (Map.Entry<String, String> elem2: copy2.entrySet()){
                if (elem1.getValue().equals(elem2.getValue()) )
                {
                    counter++;
                }
            }

            if (counter > 1) removeItemFromMapByValue(map,elem1.getValue());

        }
        }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
