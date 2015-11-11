package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> set1 = new HashSet<String>();

        set1.add("Луцьк");
        set1.add("Лама");
        set1.add("Лемур");
        set1.add("Ласка");
        set1.add("Лев");
        set1.add("Лук");
        set1.add("Лак");
        set1.add("Лом");
        set1.add("Ляк");
        set1.add("Лачс");
        set1.add("Лмвв");
        set1.add("Льььь");
        set1.add("Лкесс");
        set1.add("Лапрпрр");
        set1.add("Леккп");
        set1.add("Лсим");
        set1.add("Лпапб");
        set1.add("Лпапа");
        set1.add("Лкка");
        set1.add("Лззо");

        return set1;

    }
}
