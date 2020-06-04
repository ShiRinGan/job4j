package ru.job4j.condition2;

import org.junit.Test;

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
        int result = Max.max(2, 2, 4);
        assertThat(result, is(4));
    }

    @Test
    public void maxOfThree() {
        int result = Max.max(2, 1, 0);
        assertThat(result, is(2));
    }

    @Test
    public void maxOfFour() {
        int result = Max.max(2, 1, 0, 6);
        assertThat(result, is(6));
    }

}