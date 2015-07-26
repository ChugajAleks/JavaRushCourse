package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/
import java.io.*;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String s1 = read.readLine();
        String s2 = read.readLine(), s3 = read.readLine();
        int a = Integer.parseInt(s1), b = Integer.parseInt(s2), c = Integer.parseInt(s3);
        if ((a > b & a < c) | (a > c & a < b))
            System.out.print(a);
        if ((b > a & b < c) | (b > c & b < a))
            System.out.print(b);
        if ((c > b & c < a) | (c > a & c < b))
            System.out.print(c);
    }
}
