package com.javarush.test.level10.lesson11.bonus02;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны. Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мыла
2 Рама
1 Мама
*/

public class Solution
{
    HashMap<String, Integer> map;
    public static void main(String[] args) throws IOException
    {
        String s;
        Solution solution = new Solution();
        solution.map = new HashMap< String, Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            s= reader.readLine();
            if (s.isEmpty())  break;
            int id = Integer.parseInt(s);
            s= reader.readLine();
            if (s.isEmpty())  break;
            String name = s;
            solution.map.put(name, id);
            //System.out.println("Id=" + id + " Name=" + name);
        }

        for (Map.Entry<String, Integer> pair : solution.map.entrySet()) {
            int index = pair.getValue();
            String name = pair.getKey();
            System.out.println(index + " " + name);
        }




    }
}
