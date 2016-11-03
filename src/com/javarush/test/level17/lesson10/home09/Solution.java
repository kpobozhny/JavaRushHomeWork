package com.javarush.test.level17.lesson10.home09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines
4. Если список allLines НЕ содержит каких-либо строк, которые есть в forRemoveLines, то
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        String fileName01, fileName02;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            fileName01=br.readLine();
            fileName02=br.readLine();
            readDataFromFileIntoList(fileName01, allLines);
            readDataFromFileIntoList(fileName02, forRemoveLines);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        try
        {
            new Solution().joinData();
        }
        catch (CorruptedDataException e)
        {
            e.printStackTrace();
        }
    }

    public static void readDataFromFileIntoList(String fileName, List<String> dataList){
        try {
            String currentLine;
            BufferedReader br = new BufferedReader(new FileReader(fileName));


            currentLine = br.readLine();
            while (currentLine!=null){

                dataList.add(currentLine);
                currentLine = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1){
            e1.printStackTrace();
        }
    }

    public void joinData () throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines) ){
            allLines.removeAll(forRemoveLines);
            } else{
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
