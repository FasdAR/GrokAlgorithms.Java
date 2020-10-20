package ru.fasdev.firstChapter;

public class BinarySearch
{
    public Integer searchItem(Integer[] array, Integer searchItem)
    {
        int countOperation = 0;

        int lowIndex = 0;
        int heightIndex = array.length;

        while (lowIndex <= heightIndex) {
            countOperation++;

            int selectedIndex = (lowIndex + heightIndex) / 2;
            int selectedItem = array[selectedIndex];

            if (selectedItem == searchItem)
            {
                System.out.println("BINARY_SEARCH O("+countOperation+")");

                return selectedItem;
            }
            else if (selectedItem > searchItem)
                heightIndex = selectedIndex - 1;
            else
                lowIndex = selectedIndex + 1;
        }

        return null;
    }
}
