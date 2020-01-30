package ru.job4j.Сondition;

public class SqMax {
    public static void main (String[] args) {
        System.out.println(max(1000,200,10,80));
    }
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if ((first > second) && (first > third)) {
                if (first > forth) {
                    result = first;
                }

        } else if (second > third) {
            if (second > forth) {
                result = second;
            }
        } else if (third > forth) {
            result = third;
        }
        return result;
    }
}