package com.fasddev.grokalg;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        exmapleSumArray();
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
