package ru.fasdev;

import ru.fasdev.firstChapter.BinarySearch;
import ru.fasdev.twoChapter.SelectionSort;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        //#region TEST BINARY SEARCH
        testBinarySearchInt();
        testBinarySearchString();
        //#endregion

        //#region TEST SELECTION SORT
        testSelectionSort();
        //#endregion
    }

    static void testSelectionSort() {
        Integer[] array = new Integer[]{10, 5, 3, 8, 100, 65, 45, 67, 32, 98, 43, 6};
        Integer[] sortedArray = new SelectionSort().sortedArrayDescending(array);

        System.out.print("SELECTED_SORTED RESULT = { ");
        for (Integer i: sortedArray) {
            System.out.print(i + " ");
        }
        System.out.print("}");
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
