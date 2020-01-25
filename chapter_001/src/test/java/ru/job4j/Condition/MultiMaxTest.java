package ru.job4j.Condition;

import org.junit.Test;
import ru.job4j.Сondition.MultiMax;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result2 = check.max(10, 15, 9);
        assertThat(result2, is(15));
    }
}
