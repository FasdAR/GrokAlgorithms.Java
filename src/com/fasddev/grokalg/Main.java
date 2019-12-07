package com.fasddev.grokalg;

import javafx.scene.paint.Color;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        exampleQuickSort();
    }

    static void exampleQuickSort()
    {
        Integer[] array = {825, 800, 500, 20, 500, 800, 600, 700, 20, 22, 830, 80};

        Integer[] resultArray = QuickSort.quickSort(array);

        System.out.print("QuickSort Array: ");

        for (Integer value: resultArray)
        {
            System.out.print(value.toString() + " ");
        }
    }

    static void exampleGetBiggerNumber()
    {
        Integer[] array = {825, 800, 500, 20, 830, 80};

        int number = Recursion.getBiggerNumber(array);

        System.out.println("Big Number: " + number);
    }

    static void exmapleSizeArray()
    {
        Integer[] array = {0, 10, 20, 50, 60, 80};

        int res = Recursion.sizeArray(array);

        System.out.println("Size Array: " + res);
    }

    static void exmapleSumArray()
    {
        Integer[] array = {0, 10, 20, 50, 60, 80};
        int sum = Recursion.sumArray(array);

        System.out.println("Sum: " + sum);
    }

    static void exampleBinarySearch()
    {
        Integer[] array = {0, 10, 20, 50, 60, 80};
        Integer searhcItem = BinarySearch.searchInList(array, 80);

        if (searhcItem != null)
        {
            System.out.println("ITEM_SEARCHED_INDEX: " + searhcItem + " ITEM: " + array[searhcItem]);
        }
        else
        {
            System.out.println("ITEM_NULLED");
        }
    }
}
