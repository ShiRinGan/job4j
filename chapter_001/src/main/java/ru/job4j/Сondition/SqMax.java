package ru.job4j.Сondition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int result;
        if ((first > second)&&(first > third)&&(first > forth)) {
                    result = first;
                }
                else if ((second > third)&&(second > forth)) {
                result = second;
            }
                else if (third>forth){
            result = third;
        }
                else
                    return forth;
        return result;
    }
}