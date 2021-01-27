package chapterTwo;

import java.util.ArrayList;

public class SelectionSort
{
    public static void main(String[] args)
    {
        ArrayList<Comparable> words = new ArrayList();

        words.add('Q');
        words.add('A');
        words.add('D');
        words.add('T');
        words.add('E');
        words.add('W');

        System.out.println(sort(words));
    }

    public static ArrayList<Comparable> sort(ArrayList<Comparable> list)
    {
        ArrayList<Comparable> newArray = new ArrayList();

        int count = list.size();

        for (int i=0; i<count; i++) {
            int smallPos = findSmallPos(list);
            Comparable smallItem = list.get(smallPos);

            list.remove(smallPos);
            newArray.add(smallItem);
        }

        return newArray;
    }

    private static int findSmallPos(ArrayList<Comparable> array) {
        int smallPos = 0;

        for (int i=0; i<array.size(); i++) {
            Comparable smallItem = array.get(smallPos);
            Comparable currentItem = array.get(i);

            if (smallItem.compareTo(currentItem) > 0) {
                smallPos = i;
            }
        }

        return smallPos;
    }
}
