package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        int count = Integer.parseInt(reader.readLine());
        int array[] = new int[count];
        for(int i = 0; i<count; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }
        for(int i = array.length-1; i>0; i--)
        {
            for(int j = 0; j < i; j++)
            {
                if(array[j] > array[j+1])
                {
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        maximum = array[array.length-1];
        System.out.println(maximum);
    }
}
