package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> str = new ArrayList<String>();
        str.add("qwer");
        str.add("qwert");
        str.add("qwerty");
        str.add("qwertyu");
        str.add("qwertyui");
        System.out.println(str.size());
        for(String x: str)
            System.out.println(x);

    }
}
