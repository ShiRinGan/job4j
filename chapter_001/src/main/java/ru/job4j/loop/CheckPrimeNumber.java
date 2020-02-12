package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
int num = 0;
        boolean prime = finish >1;
        for (int index = 2; index < finish; index++) {
num+=index;
            if ((finish%index == 0)) {
                prime = false;
                break;
            }
            else if(finish>=num){
                    break;
                }
            }
            return prime;
        }}