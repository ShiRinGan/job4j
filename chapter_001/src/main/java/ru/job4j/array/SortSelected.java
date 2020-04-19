package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int min = 0; min < data.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < data.length; j++) {
                if (data[j] < data[least]) {
                    least = j;
                }
            }
            int tmp = data[min];
            data[min] = data[least];
            data[least] = tmp;
        }

    return data;
}}