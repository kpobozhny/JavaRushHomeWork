package com.javarush.test.level14.lesson08.bonus03;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by kostyap on 10/5/2016.
 */
public class EndUserAttributesServiceImpl {
    private static volatile EndUserAttributesServiceImpl SingletonRef;
    private static final Lock SingletonLock = new ReentrantLock();

    private EndUserAttributesServiceImpl()
    {
    }

    public static EndUserAttributesServiceImpl getInstance()
    {
        if (EndUserAttributesServiceImpl.SingletonRef == null)
        {
            try
            {
                EndUserAttributesServiceImpl.SingletonLock.lock();
                EndUserAttributesServiceImpl.SingletonRef = new EndUserAttributesServiceImpl();
            }
            finally
            {
                EndUserAttributesServiceImpl.SingletonLock.unlock();
            }
        }
        return EndUserAttributesServiceImpl.SingletonRef;
    }
}
