package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int min = MinDiapason.findMin(data, 0, data.length);
        int index = FindLoop.indexOf(data, min, 0, data.length);
        for (int i = 0; i<index; i++){
            if (index<min){
                min=index;
                for (index=0; index<data.length; index++){
                    int temp = data[index];
                    data[index] = data[data.length - 1];
                    data[data.length-1] = temp;
                }
            }
        }
                return data;
    }}