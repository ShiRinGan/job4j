package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
        int num = 0;
        boolean prime = false;
        for (int index = 2; index <= finish; index++) {
            num += index;
            if ((finish%num != 0)) {
                prime = true;
                break;
            }
            else if(finish>=num){
                break;
            }
        }
        return prime;
    }}