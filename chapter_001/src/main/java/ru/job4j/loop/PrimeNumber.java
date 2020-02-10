package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int number = 2; number < finish; number++){
            count+=number;
            if (CheckPrimeNumber.check(number)){
                break;}
            else if (finish>=number);{
                break;}
            }
        return count;
        }
    }