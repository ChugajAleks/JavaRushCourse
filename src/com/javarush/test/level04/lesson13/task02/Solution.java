package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int s1_int = Integer.parseInt(s1);
        int s2_int = Integer.parseInt(s2);
        for (int i = 0; i<s1_int; i++)
        {
            for(int j = 0; j < s2_int; j++)
                System.out.print(8);
            System.out.println();
        }

    }
}