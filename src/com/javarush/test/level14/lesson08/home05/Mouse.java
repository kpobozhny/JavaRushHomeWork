package com.javarush.test.level14.lesson08.home05;

/**
 * Created by kostya on 10/3/16.
 */
public class Mouse implements CompItem
{
    public String getName(){
        return this.getClass().getSimpleName();
    }

}
