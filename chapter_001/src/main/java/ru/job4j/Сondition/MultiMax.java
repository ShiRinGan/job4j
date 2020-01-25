package ru.job4j.Сondition;

public class MultiMax {
    public int max(int first, int second, int third){
        boolean rsl1=first>second;
        int result = rsl1?first:second;
        boolean rsl2=result>third;
        int result2 = rsl2?result:third;
        return result2;
    }
}
