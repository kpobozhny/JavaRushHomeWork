package com.javarush.test.level14.lesson08.home09;

/**
 * Created by kostya on 10/4/16.
 */
public class USD extends Money
{
    public USD(double amount)
    {
        super(amount);
    }
    public String getCurrencyName(){
        return "USD";
    };
}
