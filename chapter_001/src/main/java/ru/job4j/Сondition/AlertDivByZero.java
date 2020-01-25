package ru.job4j.Сondition;

public class AlertDivByZero {
    public static void main (String[] args){
        possibleDiv(-1);
        possibleDiv(0);
        possibleDiv(100);
    }
    public static void possibleDiv(int number){
        if (number == 0){
            System.out.println("Could not div by 0.");
        }
        if (number<0){
            System.out.println("This is negative numbers");
        }
        if (number>0){
            System.out.println("That's OK.");
        }
    }
}