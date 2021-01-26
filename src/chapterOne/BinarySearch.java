package chapterOne;

public class BinarySearch
{
    public static Integer search(Comparable[] array, Comparable itemSearch)
    {
        int indexMin = 0;
        int indexMax = array.length - 1;

        while (indexMin <= indexMax) {
            int indexMid = (indexMin + indexMax) / 2;

            Comparable itemMid = array[indexMid];
            Integer resultCompare = itemMid.compareTo(itemSearch);

            if (resultCompare == 0)
            {
                return indexMid;
            }
            else if (resultCompare > 0) // Больше
            {
                indexMax = indexMid - 1;
            }
            else // Меньше
            {
                indexMin = indexMid + 1;
            }
        }

        return null;
    }
}

//1.1 - 7
//1.2 - 8