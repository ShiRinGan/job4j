package ru.job4j.Condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.Сondition.SqArea;

public class SqAreaTest {
    @Test
    public void square(){
        int p=4;
        int k=1;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
