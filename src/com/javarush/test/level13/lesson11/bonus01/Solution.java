package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        ArrayList<Integer> arList = new ArrayList<Integer>();

        try {

            String sCurrentLine;
            Integer currentNumber;


            reader = new BufferedReader(new FileReader(fileName));
            sCurrentLine=reader.readLine();

            while (sCurrentLine != null) {
                currentNumber = Integer.parseInt(sCurrentLine);
                if (currentNumber%2==0){
                    if(arList.size()==0){
                        arList.add(0, currentNumber);
                    } else {

                        int startSize = arList.size();
                        for (int i=0; i<arList.size(); i++){
                            if (currentNumber<arList.get(i)){
                                arList.add(i,currentNumber);
                                break;
                            }

                        }
                        if (startSize == arList.size()){
                            arList.add(currentNumber);

                        }

                    }

                }
                sCurrentLine = reader.readLine();;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
            try {
                if (reader != null)reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        for (int i=0; i<arList.size(); i++){
            System.out.println(arList.get(i));
        }

    }



}
