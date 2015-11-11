package com.javarush.test.level08.lesson11.home09;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        //System.out.println(isDateOdd("JANUARY 1 2000"));
        //System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date)
    {
        boolean isOdd = false;
        String[] parsedDate = date.split(" ");
        int[] parsedDateInt = {
                0,
                Integer.parseInt(parsedDate[1]),
                Integer.parseInt(parsedDate[2])
        };

        Date yearStartTine = new Date();
        yearStartTine.setHours(0);
        yearStartTine.setMinutes(0);
        yearStartTine.setMinutes(0);
        yearStartTine.setDate(1);
        yearStartTine.setMonth(0);
        yearStartTine.setYear(parsedDateInt[2]);

        String[] months = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER",
                "NOVEMBER", "DECEMBER"};

        for (int i = 0; i < months.length; i++){
            if (months[i].equals(parsedDate[0])){
                parsedDateInt[0] =  i;
                break;
            }
        }

        Date d = new Date();
        d.setDate(parsedDateInt[1]);
        d.setMonth(parsedDateInt[0]);
        d.setYear(parsedDateInt[2]);

        long timeDelay = d.getTime() - yearStartTine.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        long dayCount = timeDelay/msDay;

        if (dayCount%2 == 0) return true; else return false;



        //return isOdd;
    }
}
