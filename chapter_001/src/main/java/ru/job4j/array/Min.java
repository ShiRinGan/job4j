package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];// установка элемента массива по умолчанию, с ним будет все сравниваться
        for (int index = 0; index < array.length; index++) {
            if (array[index]<min){//если элемент из массива меньше, чем установленный потенциальный максимум по умолчанию
                min = array[index];//то он и становится минимальным элементам и продолжает сравнивать до окончания элементов в массиве
            }
           }
        return min; //выводим минимальный элемент массива
    }
}