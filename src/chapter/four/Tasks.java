package chapter.four;

import java.util.ArrayList;
import java.util.List;

public class Tasks {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(9);
        data.add(3);

        int resultSum = sum(data);
        int resultCounts = countItems(data);
        int resultMaxItem = max(data);

        System.out.println("4.1: " + resultSum);
        System.out.println("4.2: " + resultCounts);
        System.out.println("4.3: " + resultMaxItem);
    }

    //4.1
    static Integer sum(List<Integer> data) {
        if (data.isEmpty()) {
            return 0;
        }

        List<Integer> subList = data.subList(1, data.size());
        return data.get(0) + sum(subList);
    }

    //4.2
    static Integer countItems(List data) {
        if (data.isEmpty()) {
             return 0;
        }

        List newData = data.subList(1, data.size());
        return countItems(newData) + 1;
    }

    //4.3
    //Example implementation in book
    static Integer max(List<Integer> data) {
        if (data.size() == 2) {
            if (data.get(0) > data.get(1)) {
                return data.get(0);
            } else {
                return data.get(1);
            }
        }

        List<Integer> newData = data.subList(1, data.size());
        Integer subMax = max(newData);
        if (data.get(0) > subMax) {
            return data.get(0);
        } else {
            return subMax;
        }
    }

    //My own implementation
    static Integer maxItem(List<Integer> data) {
        return findMaxItem(data, data.get(0));
    }

    static Integer findMaxItem(List<Integer> data, Integer maxValue) {
        if (data.isEmpty()) {
            return maxValue;
        }

        int newMaxValue = maxValue;
        if (data.get(0) > maxValue) {
            newMaxValue = data.get(0);
        }

        List<Integer> newData = data.subList(1, data.size());
        return findMaxItem(newData, newMaxValue);
    }
}
