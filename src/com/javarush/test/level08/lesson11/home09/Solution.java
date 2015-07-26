package com.javarush.test.level08.lesson11.home09;

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
        isDateOdd("FEB 1 2015");
    }

    public static boolean isDateOdd(String date)
    {
        Date start = new Date("JAN 1 2015");
        Date end = new Date(date);
        System.out.println(start);
        System.out.println(end);
        long dif = end.getTime() - start.getTime();
        long difDay = dif / (1000 * 60 * 60 * 24);
        System.out.println(difDay);

        return (difDay%2 == 0)?true:false;
    }
}
