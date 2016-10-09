package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static{
        labels.put(2.2, "two and two");
        labels.put(2.3, "two and three");
        labels.put(2.4, "two and four");
        labels.put(2.5, "two and five");
        labels.put(2.6, "two and six");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
