package ru.job4j.Сondition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance(){
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 3;
        double expected = 2.83;
        double out = Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
