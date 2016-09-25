package com.javarush.test.level14.lesson06.home01;

/**
 * Created by kostya on 9/25/16.
 */
public class BelarusianHen extends Hen
{
    int getCountOfEggsPerMonth(){
        return 15;
    };

    String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц." ;
    }
}
