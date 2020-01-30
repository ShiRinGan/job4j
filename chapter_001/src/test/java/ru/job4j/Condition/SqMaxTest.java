package ru.job4j.Condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.Сondition.MultiMax;
import ru.job4j.Сondition.SqMax;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void foundMax3() {
        SqMax check = new SqMax();
        int result = check.max(8, 4, 9, 5);
        assertThat(result, is(9));
    }

    @Test
    public void foundMax1() {
        SqMax check = new SqMax();
        int result = check.max(80, 4, 9, 5);
        assertThat(result, is(80));
    }

    @Test
    public void foundMax2() {
        SqMax check = new SqMax();
        int result = check.max(80, 400, 9, 5);
        assertThat(result, is(400));
    }

    @Test
    public void foundMax4() {
        SqMax check = new SqMax();
        int result = check.max(8, 4, 9, 50);
        assertThat(result, is(50));
    }
}
