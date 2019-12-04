package com.fasddev.grokalg;

public class Recursion
{
    static int sumArray(Integer[] array)
    {
        return sumArray(0, array);
    }

    private static int sumArray(int startIndex, Integer[] array) //0, {0, 10, 20, 50, 60, 80}; | 1 | 2 | 3 | 4
    {
        int sum = array[startIndex]; // 0, 10, 20, 50, 60
        startIndex ++; // 1, 2, 3, 4, 5

        if (startIndex != array.length) // 1 != 5 | 2 != 5, 3 != 5, 4 != 5, 5 == 5
        {
            sum += sumArray(startIndex, array); // 0 + f(1, ...) | 10 + f (2, ...) | 20 + f(3, ...) | 50 + f(4, ...)
            return sum; // 60 + 80 = 140 | 140 + 50 = 190 | 190 + 20 = 210 | 210 + 10 = 220 | 220 + 0 = 0
        }
        else
            return sum; // 80
    }
}