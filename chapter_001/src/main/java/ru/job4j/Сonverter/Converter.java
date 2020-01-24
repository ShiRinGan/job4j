package ru.job4j.Сonverter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int DollarToRubble(int value) {
        return value * 60;
    }

    public static int EuroToRuble(int value) {
        return value * 70;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        int in1 = 140;
        int expected1 = 2;
        int out1 = rubleToEuro(in1);

        int dollar = rubleToDollar(180);
        int in2 = 180;
        int expected2 = 3;
        int out2 = rubleToDollar(in2);

        int ruble = DollarToRubble(20);
        int in3 = 3;
        int expected3 = 180;
        int out3 = DollarToRubble(in3);

        int ruble2 = EuroToRuble(10);
        int in4 = 2;
        int expected4 = 140;
        int out4 = EuroToRuble(in4);

        boolean passed1 = expected1 == out1;
        boolean passed2 = expected2 == out2;
        boolean passed3 = expected3 == out3;
        boolean passed4 = expected4 == out4;

        System.out.println("140 rubles are " + euro + " euro." + "Test result: " + passed1);
        System.out.println("180 rubles are " + dollar + " dollars." + "Test result: " + passed2);
        System.out.println("20 dollars are " + ruble + " rubles." + "Test result: " + passed3);
        System.out.println("10 euro are " + ruble2 + " rubles." + "Test result: " + passed4);

    }
}
