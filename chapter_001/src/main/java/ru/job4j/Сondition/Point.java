package ru.job4j.Сondition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2){
        double a = x2-x1;
        double b = y2-y1;
        double c = Math.pow(a, 2);
        double d = Math.pow (b, 2);
        double e = c + d;
        double f = Math.sqrt(e);
        return f;
    }
    public static void main(String[] args){
        double result = distance(1,1,3,3);
        System.out.println("result is "+ result);
    }
}
