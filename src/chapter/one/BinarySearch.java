package chapter.one;

public class BinarySearch
{
    public static void main(String[] args) {
        String[] inputData = new String[]{"1", "3", "5", "7", "9"};
        int result = search(inputData, "3");
        System.out.println("Index: " + result);
    }

    public static <T> Integer search(Comparable<T>[] data, T query) {
        int countBigO = 0;

        int indexStart = 0;
        int indexEnd = data.length - 1;

        while (indexStart <= indexEnd) {
            countBigO++;

            int checkIndex = (indexStart + indexEnd) / 2;
            Comparable<T> checkValue = data[checkIndex];

            int resultCompare = checkValue.compareTo(query);

            if (resultCompare == 0) { // равно
                System.out.println("Count operations: " + countBigO);
                return checkIndex;
            } else if (resultCompare > 0) { // больше
                indexEnd = checkIndex - 1;
            } else { // меньше
                indexStart = checkIndex + 1;
            }
        }

        System.out.println("Count operations: " + countBigO);
        return null;
    }
}
