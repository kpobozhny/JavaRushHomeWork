package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> setInt = new HashSet<Integer>();

        setInt.add(23);
        setInt.add(3);
        setInt.add(41);
        setInt.add(5);
        setInt.add(8);
        setInt.add(37);
        setInt.add(244);
        setInt.add(2);
        setInt.add(90);
        setInt.add(50);
        setInt.add(20);
        setInt.add(7);
        setInt.add(17);
        setInt.add(70);
        setInt.add(80);
        setInt.add(43);
        setInt.add(66);
        setInt.add(98);
        setInt.add(52);
        setInt.add(99);

        return setInt;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
//        for (Integer elem : set){
//            if (elem > 10) {
//                set.remove(elem);
//
//
//            }
//
//        }

        Iterator<Integer> itr = set.iterator();
        int temp;
        HashSet<Integer> tempSet = new HashSet<Integer>();
        while (itr.hasNext()){
            temp = itr.next();
            if (temp > 10){
                tempSet.add(temp);

            }
        }
        set.removeAll(tempSet);

    return set;
    }

    public static void main(String [] args)
    {

        HashSet<Integer> mySet = createSet();
        System.out.println(mySet);
        System.out.println(removeAllNumbersMoreThan10(mySet));
    }
}
