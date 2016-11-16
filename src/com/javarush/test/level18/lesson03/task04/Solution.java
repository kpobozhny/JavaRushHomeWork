package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis= new FileInputStream(reader.readLine());
        int data=0;
        int min=1;
        Map<Integer, Integer> store = new HashMap<Integer, Integer>();
        while (fis.available()>0){
            data=fis.read();
            if (store.containsKey(data)){
                store.put(data, store.get(data)+1);
            }else store.put(data, 1);

        }
        for (Map.Entry<Integer, Integer> item: store.entrySet()){
            if (min>item.getValue()) min=item.getValue();
        }

        for (Map.Entry<Integer, Integer> item: store.entrySet()){
            if (min==item.getValue()) System.out.println(item.getKey()+" ");
        }


        fis.close();
    }
}
