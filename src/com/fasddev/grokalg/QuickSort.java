package com.fasddev.grokalg;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort
{
    public static Integer[] quickSort(Integer[] array)
    {
        if (array.length < 2)
            return array;
        else
        {
            Integer middleIndex = array.length/2;
            Integer middleValue = array[array.length/2];

            ArrayList<Integer> less = new ArrayList();
            ArrayList<Integer> greater = new ArrayList();

            for (int i=0; i<array.length; i++)
            {
                if (i != middleIndex)
                {
                    if (array[i] < middleValue)
                        less.add(array[i]);
                    else
                        greater.add(array[i]);
                }
            }

            Integer[] lessArray = quickSort(less.toArray(new Integer[0]));
            Integer[] graterArray = quickSort(greater.toArray(new Integer[0]));

            ArrayList<Integer> returnArray = new ArrayList();
            returnArray.addAll(Arrays.asList(lessArray));
            returnArray.add(middleValue);
            returnArray.addAll(Arrays.asList(graterArray));

            return returnArray.toArray(new Integer[0]);
        }
    }
}
