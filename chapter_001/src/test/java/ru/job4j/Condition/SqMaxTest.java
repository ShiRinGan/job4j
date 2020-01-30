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
    public void foundMax() {
        SqMax check = new SqMax();
        int result = check.max(8, 4, 9, 5);
        assertThat(result, is(9));
    }
}