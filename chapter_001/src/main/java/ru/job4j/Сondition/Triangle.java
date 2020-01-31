package ru.job4j.Сondition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        boolean op1 = (ab + ac) > bc;
        boolean op2 = (ac + bc) > ab;
        boolean op3 = (ab + bc) > ac;
        return (op1 && op2 && op3);
    }
}