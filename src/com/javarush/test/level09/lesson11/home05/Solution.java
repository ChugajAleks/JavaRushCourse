package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args)
    {
        try
        {
            splitString();
        }
        catch (ReadStringException e)
        {
            System.err.println("Error on input string: ");
            e.printStackTrace();
            System.exit(10);
        }
        catch(Exception e)
        {
            System.err.println("Error on module string splitter: ");
            e.printStackTrace();
            System.exit(100);
        }


    }

    private static void splitString() throws ReadStringException
    {
        String readedString = "";
        try
        {
            readedString = readString();
        }
        catch (ReadStringException e)
        {
            System.out.println(e.getLocalizedMessage() + " повторите ввод");
            readedString = readString();
        }
        char[] charArray = readedString.toCharArray();

        StringBuffer bufSoglasnie = new StringBuffer();
        StringBuffer bufGlasnie = new StringBuffer();

        for(int i = 0; i < charArray.length; i++){
            if(isVowel(charArray[i])) {
                bufGlasnie.append(charArray[i] + " ");
            }
            else if(charArray[i] == ' '){
                continue;
            }
            else
            {
                bufSoglasnie.append(charArray[i] + " ");
            }
        }
        System.out.println(bufGlasnie.toString());
        System.out.println(bufSoglasnie.toString());
    }

    private static String readString() throws ReadStringException
    {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        try
        {
           result = reader.readLine();
        }
        catch (IOException e)
        {
            throw new ReadStringException("Unknown io error", e);

        }
        if(result.isEmpty()){
            throw new ReadStringException("Maby entered empty string");
        }
        return result;
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }


    private static class ReadStringException extends IOException
    {
        public ReadStringException(String message, IOException cause)
        {
            super (message, cause);
        }

        public ReadStringException(String massage)
        {
            super(massage);
        }
    }
}
