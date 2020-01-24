package ru.job4j.Сonverter;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.Сonverter.Converter;

public class ConverterTest {
    @Test
    public void rubleToEuro() {
        int in1 = 140;
        int expected1 = 2;
        int out1 = Converter.rubleToEuro(in1);
        Assert.assertEquals(expected1, out1);
    }

    @Test
    public void rubleToDollar() {
        int in2 = 180;
        int expected2 = 3;
        int out2 = Converter.rubleToDollar(in2);
        Assert.assertEquals(expected2, out2);
    }

    @Test
    public void DollarToRubble() {
        int in3 = 3;
        int expected3 = 180;
        int out3 = Converter.DollarToRubble(in3);
        Assert.assertEquals(expected3, out3);
    }

    @Test
    public void EuroToRuble() {
        int in4 = 2;
        int expected4 = 140;
        int out4 = Converter.EuroToRuble(in4);
        Assert.assertEquals(expected4, out4);
    }
}
