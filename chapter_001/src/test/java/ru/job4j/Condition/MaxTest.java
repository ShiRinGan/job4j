package ru.job4j.Condition;

import org.junit.Test;
import ru.job4j.Сondition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMaxEqual() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

}
