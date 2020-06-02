package ru.job4j.condition2;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        int result = condition ? left : right;
        return result;
    }

    public static int max(int left, int right, int middle) {
        return max(left, max(right, middle));
    }

}