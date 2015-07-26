package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;


/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    //public static void main(String[] args)
    //{
       /* for (String text : createSet())
            System.out.println(text);  */
    //}
    public static Set<String> createSet()
    {
        //Напишите тут ваш код
        HashSet<String> set = new HashSet<String>();
        set.add("Любовь");
        set.add("Лодка");
        set.add("Лошадь");
        set.add("Лось");
        set.add("Лиса");
        set.add("Люди");
        set.add("Лихо");
        set.add("Лама");
        set.add("Лак");
        set.add("Ладан");
        set.add("Лавочка");
        set.add("Леший");
        set.add("Лучший");
        set.add("Лекарство");
        set.add("Литавры");
        set.add("Лик");
        set.add("Лыко");
        set.add("Ложь");
        set.add("Лесть");
        set.add("Лымарь");

        return set;
    }
}