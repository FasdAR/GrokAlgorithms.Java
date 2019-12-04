package com.fasddev.grokalg;

public class Recursion
{
    static int sumArray(Integer[] array)
    {
        return sumArray(0, array);
    }

    private static int sumArray(int startIndex, Integer[] array)
    {
        int sum = array[0];

        for (int i = startIndex; i < array.length; i++)
        {
            sum += array[i];
        }

        if (startIndex == array.length)
            return sum + sumArray(startIndex++, array);
        else
            return sum;
    }
}
