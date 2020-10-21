package ru.fasdev.twoChapter;

import java.lang.reflect.Array;

public class SelectionSort
{
    public Integer[] sortedArrayDescending(Integer[] array) {
        int countOperation = 0;

        for (int i=0; i< array.length; i++) {
            countOperation ++;

            Integer bigIndex = i;

            for (int l = i + 1; l < array.length; l++) {
                countOperation++;

                if (array[bigIndex] < array[l]) {
                    bigIndex = l;
                }
            }

            Integer currentItem = array[i];
            array[i] = array[bigIndex];
            array[bigIndex] = currentItem;
        }

        System.out.println("SELECTION_SORT O("+countOperation+")");

        return array;
    }
}
