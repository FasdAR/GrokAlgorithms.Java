package com.fasddev.grokalg;

import java.util.List;

public class BinarySearch
{
    static Integer searchInList(Integer[] array, int searchItem)
    {
        int countOperation = 0; // Счетчик операций

        int lowIndex = 0; // Находим начальный индекс
        int highIndex = array.length-1; // Находим последний индекс

        Integer resultIndex = null; // Итоговый результат

        while (lowIndex <= highIndex) // Пока начальный индекс меньшн большого, то продолжаем поиски
        {
            countOperation++; // Добавляем к счетчику операцию

            int mediumIndex = (lowIndex + highIndex) / 2; // Находим средний индекс
            int currentItem = array[mediumIndex]; // И его айтем

            if (currentItem == searchItem) // Нашли айтем
            {
                resultIndex = mediumIndex;
                break;
            }
            else if (currentItem < searchItem) // Если текущий айтем меньше искоемого
            {
                lowIndex = mediumIndex + 1; // Переходим к следующему индексу вперед от среднего
            }
            else
            {
                highIndex = mediumIndex - 1; // Переходим к следующему индексу назад от среднего
            }
        }

        System.out.println("BinarySearch O: " + countOperation);

        return resultIndex;
    }
}
