package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int first = 1; first <= n; first++){
            result=result*first;
        }
        return result;
}
}