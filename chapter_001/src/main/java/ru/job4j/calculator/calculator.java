package ru.job4j.calculator;

/**
 * Class Класс для вычисления арифметических операций + - * / ^.
 * @author Филипп
 * @version 1.0
 * @since 17.01.2020
 *
 */
public class calculator {
    /**
     * Сложение
     * @param first
     * @param second
     * @return результат
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    /**
     * Деление
     * @param first
     * @param second
     * @return результат
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    /**
     * Умножение
     * @param first
     * @param second
     * @return вывод на экран результата
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    /**
     * Вычитание
     * @param first
     * @param second
     * @return результат
     */
    public static void subtrack(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * Объявление значения переменным
     * @param args
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtrack(10, 5);
    }
}
