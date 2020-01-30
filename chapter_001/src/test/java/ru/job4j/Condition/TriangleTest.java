package ru.job4j.Condition;

import org.junit.Test;
import ru.job4j.Сondition.Triangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2, 2, 2);
        assertThat(result, is(true));
    }
}

