package ru.job4j.array;

import java.util.Arrays;

public class Merge { //объединение двух массивов без приминения сортировки

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int iLeft = 0; //задать переменную для левой части
        int iRight = 0; //задать переменную для правой части
        int iResult = 0; //задать переменную для результатирующего массива
        while (iLeft + iRight != rsl.length) { //пока сумма двух массивов не равна
            if (iLeft != left.length && iRight != right.length) { //проверяем первое условие
                rsl[iResult++] = left[iLeft] < right[iRight] ? left[iLeft++] : right[iRight++];
            } else if (iLeft != left.length) {
                rsl[iResult++] = left[iLeft++];
            } else {
                rsl[iResult++] = right[iRight++];
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}