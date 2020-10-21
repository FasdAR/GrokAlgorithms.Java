package ru.fasdev.twoChapter;

import java.lang.reflect.Array;

public class SelectionSort
{
    public Integer[] sortedArrayDescending(Integer[] array) {
        for (int i=0; i< array.length; i++) {
            Integer bigIndex = i;

            for (int l = i + 1; l < array.length; l++) {
                if (array[bigIndex] < array[l]) {
                    bigIndex = l;
                }
            }

            Integer currentItem = array[i];
            array[i] = array[bigIndex];
            array[bigIndex] = currentItem;
        }

        return array;
    }
}
