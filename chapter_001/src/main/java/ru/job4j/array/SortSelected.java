package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int min = MinDiapason.findMin(data, 0, data.length);
        int index = FindLoop.indexOf(data, min, 0, data.length);
        for (index=min; index<data.length; index++){
            if (data[index]<min){
                min=index;
            }
            }
        return data;
    }
}
