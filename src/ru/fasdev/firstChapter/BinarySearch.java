package ru.fasdev.firstChapter;

public class BinarySearch
{
    public <T extends Comparable> T searchItem(T[] array, T searchItem)
    {
        int countOperation = 0;

        int lowIndex = 0;
        int heightIndex = array.length - 1;

        while (lowIndex <= heightIndex) {
            countOperation++;

            int selectedIndex = (lowIndex + heightIndex) / 2;
            T selectedItem = array[selectedIndex];

            int compare = selectedItem.compareTo(searchItem);

            if (compare == 0)
            {
                System.out.println("BINARY_SEARCH O("+countOperation+")");

                return selectedItem;
            }
            else if (compare > 0)
                heightIndex = selectedIndex - 1;
            else
                lowIndex = selectedIndex + 1;
        }

        return null;
    }
}
