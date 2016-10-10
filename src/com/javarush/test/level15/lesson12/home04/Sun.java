package com.javarush.test.level15.lesson12.home04;

/**
 * Created by kostya on 10/10/16.
 */
public class Sun implements Planet
{
    private static Sun instance;

    public static Sun getInstance(){

        if (instance==null){
            instance = new Sun();
        }
        return instance;
    }

    private Sun(){}
}
