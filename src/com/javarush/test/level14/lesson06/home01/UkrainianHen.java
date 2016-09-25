package com.javarush.test.level14.lesson06.home01;

/**
 * Created by kostya on 9/25/16.
 */
public class UkrainianHen extends Hen
{
    int getCountOfEggsPerMonth(){
        return 20;
    };

    String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц." ;
    }
}
