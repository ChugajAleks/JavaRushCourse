package com.javarush.test.level07.lesson06.task02;

/* 5 строчек: «101», «102», «103», «104», «105»
1. Создай список строк.
2. Добавь в него 5 строчек: «101», «102», «103», «104», «105».
3. Удали первую, среднюю и последнюю.
4. Используя цикл выведи на экран его содержимое, каждое значение с новой строки.
5. Выведи его размер. (После удаления одного элемента индексы остальных меняются.
Например, если удалить 0-й элемент, то тот, который был 1-м, станет 0-м. И т.д.)
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> str = new ArrayList<String>();
        str.add("101");
        str.add("102");
        str.add("103");
        str.add("104");
        str.add("105");
        str.remove(0);
        str.remove(1);
        str.remove(str.size() - 1);
        for (int i = 0; i < str.size(); i++)
        {
            System.out.println(str.get(i));
        }
        System.out.println(str.size());

    }
}
