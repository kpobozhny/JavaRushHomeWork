package com.javarush.test.level07.lesson06.task02;

/* 5 строчек: «101», «102», «103», «104», «105»
1. Создай список строк.
2. Добавь в него 5 строчек: «101», «102», «103», «104», «105».
3. Удали первую, среднюю и последнюю.
4. Используя цикл выведи на экран его содержимое, каждое значение с новой строки.
5. Выведи его размер. (После удаления одного элемента индексы остальных меняются.
Например, если удалить 0-й элемент, то тот, который был 1-м, станет 0-м. И т.д.)
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> listStr = new ArrayList<String>();
        listStr.add("101");
        listStr.add("102");
        listStr.add("103");
        listStr.add("104");
        listStr.add("105");
        listStr.remove(0);
        listStr.remove(listStr.size()/2-1);
        listStr.remove(listStr.size()-1);
        for (int i=0; i < listStr.size(); i++){
            System.out.println(listStr.get(i));
        }
        System.out.println(listStr.size());

    }
}
