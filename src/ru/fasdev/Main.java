package ru.fasdev;

import ru.fasdev.firstChapter.BinarySearch;

public class Main
{
    public static void main(String[] args)
    {
        testBinarySearch();
    }

    static void testBinarySearch() {
        Integer[] array = new Integer[]{1, 3, 6, 8, 9, 35, 67, 90, 120, 180, 250};

        Integer result = new BinarySearch().searchItem(array, 180);

        System.out.println("BINARY_SEARCH RESULT " + result);
    }
}
