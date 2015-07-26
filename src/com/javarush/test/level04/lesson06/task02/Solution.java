package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int var1, var2;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        String s4 = reader.readLine();
        int s1_int = Integer.parseInt(s1);
        int s2_int = Integer.parseInt(s2);
        int s3_int = Integer.parseInt(s3);
        int s4_int = Integer.parseInt(s4);
        if (s1_int > s2_int || s1_int == s2_int)
            var1 = s1_int;
        else
            var1 = s2_int;
        if (s3_int > s4_int || s3_int == s4_int)
            var2 = s3_int;
        else
            var2 = s4_int;
        if (var1 > var2 || var1 == var2)
            System.out.print(var1);
        else
            System.out.print(var2);
    }
}
