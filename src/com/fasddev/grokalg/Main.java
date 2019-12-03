package com.fasddev.grokalg;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        exampleBinarySearch();
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
