package ru.fasdev.twoChapter;

import java.lang.reflect.Array;

public class SelectionSort
{
    public Integer[] sortedArrayDescending(Integer[] array) {
        int countOperation = 0;

        for (int i=0; i< array.length; i++) {
            Integer bigIndex = i;

            for (int l = i + 1; l < array.length; l++) {
                countOperation += 2;
                if (array[bigIndex] < array[l]) {
                    bigIndex = l;
                }
            }

            countOperation++;
            Integer currentItem = array[i];

            array[i] = array[bigIndex];
            array[bigIndex] = currentItem;
        }

        System.out.println("SELECTION_SORT O("+countOperation+")");

        return array;
    }
}
