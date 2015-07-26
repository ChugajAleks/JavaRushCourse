package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        int a[] = new int[3];
        int b = Integer.parseInt(s1);
        int c = Integer.parseInt(s2);
        int d = Integer.parseInt(s3);
        a[0] =b; a[1] = c; a[2] = d;



        for(int i = a.length-1 ; i > 0 ; i--){
           for(int j = 0 ; j < i ; j++){

              if( a[j] > a[j+1] ){
                int tmp = a[j];
                a[j] = a[j+1];
                a[j+1] = tmp;
            }
        }
    }
        System.out.print(a[2]+" "+a[1]+" "+a[0]);
    }
}
