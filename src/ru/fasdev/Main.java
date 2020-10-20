package ru.fasdev;

import ru.fasdev.firstChapter.BinarySearch;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        //#region TEST BINARY SEARCH
        testBinarySearchInt();
        testBinarySearchString();
        //#endregion
    }

    static void testBinarySearchInt() {
        Integer[] array = new Integer[]{5, 6, 20, 30, 10, 12, 15};
        Arrays.sort(array);

        Integer result = new BinarySearch().searchItem(array, 12);

        System.out.println("BINARY_SEARCH RESULT = " + result);
    }

    static void testBinarySearchString() {
        String[] array = new String[]{"Hello", "World", "I Good", "Search"};
        Arrays.sort(array);

        String result = new BinarySearch().searchItem(array, "Hello");

        System.out.println("BINARY_SEARCH RESULT = " + result);
    }
}
