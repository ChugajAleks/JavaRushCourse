package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> str = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
        {
            str.add(reader.readLine());

        }
        for (int i = 0; i < str.size()/2; i++)
        {
            String tmp = str.get(str.size() -1 - i);
            str.set(str.size() -1 - i, str.get(i));
            str.set(i, tmp);
        }
        for (String s : str)
        {
            System.out.println(s);
        }

    }
}
