package ru.job4j.Condition;

import org.junit.Test;
import ru.job4j.Сondition.SqMax;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenForthMax() {
        SqMax check = new SqMax();
        int result = check.max(1, 4, 2, 5);
        assertThat(result, is(5));
    }
}
