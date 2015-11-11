package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] arrIntSmall_1 = new int[10];
        int[] arrIntSmall_2 = new int[10];
        int[] arrIntBig = new int[20];
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i < arrIntBig.length; i++){
            arrIntBig[i]= Integer.parseInt(reader.readLine());
        }

        for (int i=0; i < arrIntSmall_1.length; i++){
            arrIntSmall_1[i] = arrIntBig[i];
            arrIntSmall_2[i] = arrIntBig[i+arrIntBig.length/2];
        }

        for (int i=0; i<arrIntSmall_2.length;i++){

            System.out.println(arrIntSmall_2[i]);
        }

    }
}
