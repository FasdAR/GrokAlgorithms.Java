package chapter.two;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(3);
        list.add(7);
        List<Integer> nList = sort(list);
        System.out.println(nList);
    }

    public static <T extends Comparable<T>> List<T> sort(List<T> array) {
        ArrayList<T> newArray = new ArrayList<>();

        int size = array.size();
        for (int i=0; i<size; i++) {
            int smallIndex = findSmall(array);
            newArray.add(array.get(smallIndex));
            array.remove(smallIndex);
        }

        return newArray;
    }

    public static <T extends Comparable<T>> int findSmall(List<T> array) {
        int smallIndex = 0;
        T smallItem = array.get(smallIndex);

        for (int i=0; i<array.size(); i++) {
            T eqItem = array.get(i);
            int compareRes = smallItem.compareTo(eqItem);

            if (compareRes > 0) {
                smallIndex = i;
                smallItem = eqItem;
            }
        }

        return smallIndex;
    }
}
