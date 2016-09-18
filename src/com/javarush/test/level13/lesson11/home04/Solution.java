package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        //BufferedReader br = null;
        BufferedWriter wr = null;
        wr = new BufferedWriter(new FileWriter(fileName));

        try {

            String sCurrentLine;

            //br = new BufferedReader(new FileReader(s));
            sCurrentLine = reader.readLine();
            while (!sCurrentLine.equals("exit") ) {
                wr.write(sCurrentLine+"\n");

                //System.out.println(sCurrentLine);
                sCurrentLine = reader.readLine();
            }
            wr.write(sCurrentLine);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
            wr.close();

        }
    }
}
