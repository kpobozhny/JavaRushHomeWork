package com.javarush.test.level15.lesson12.home05;

/**
 * Created by kostya on 10/10/16.
 */
public class SubSolution extends Solution
{
    public SubSolution()
    {
    }

    public SubSolution(double d)
    {
        super(d);
    }

    public SubSolution(Character ch)
    {
        super(ch);
    }



     SubSolution(int i1, int i2)
    {
        super(i1, i2);
    }

     SubSolution(Character ch, String str)
    {
        super(ch, str);
    }

     SubSolution(boolean b, int i)
    {
        super(b, i);
    }

    protected SubSolution(String s)
    {
        super(s);
    }

    protected SubSolution(String[] strArray)
    {
        super(strArray);
    }

    protected SubSolution(boolean b)
    {
        super(b);
    }


    private SubSolution(int  i){}
    private SubSolution(String s1, String s2){}
    private SubSolution(int i, String s){}

}
