package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> listStr = new ArrayList<String>();
        listStr.add("str1");
        listStr.add("str2");
        listStr.add("str3");
        listStr.add("str4");
        listStr.add("str5");
        System.out.println(listStr.size());
        for (int i=0; i < listStr.size(); i++){
            System.out.println(listStr.get(i));
        }

    }
}
