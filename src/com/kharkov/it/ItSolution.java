package com.kharkov.it;

/**
 * Created by aleks on 20.07.15.
 */
public class ItSolution
{
    public static void main(String[] args) {
        System.out.println(pow(2,4));

}
    public static long pow(long a, long b) {
        long val = 1;
        for (int i = 0; i < b; i++)
        {
            val = val * a;
        }
        return val;
    }
}
