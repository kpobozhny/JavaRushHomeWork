package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution(){}
    public Solution(double d){}
    public Solution(Character ch){}

    Solution (int i1, int i2){}
    Solution (Character ch, String str){}
    Solution (boolean b, int i){}

    protected Solution(String s){}
    protected Solution(String[] strArray){}
    protected Solution(boolean b){}

    private Solution(int  i){}
    private Solution(String s1, String s2){}
    private Solution(int i, String s){}
}

