package com.javarush.test.level17.lesson04.task04;

/* Синхронизированный президент
И снова Singleton паттерн - синхронизация в статическом блоке
Внутри класса OurPresident в статическом блоке создайте синхронизированный блок.
Внутри синхронизированного блока инициализируйте president.
*/

public class Solution {
    public static class OurPresident {

        private static OurPresident president;

/*        public static void main(String[] args){
            OurPresident pr2 = getOurPresident();
            System.out.println(pr2);
            OurPresident pr3 = getOurPresident();
            System.out.println(pr3);
        }*/

        static{
            synchronized (Solution.class)
            {
                if (president == null) president = new OurPresident();
            }
        }

        private OurPresident() {
        }

        public static OurPresident getOurPresident() {



                return president;

        }
    }
}
