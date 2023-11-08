package main.homework.lesson11.Test;

import org.junit.Assert;
import org.junit.Test;

import main.homework.lesson11.Task;

public class TaskTest {
    @Test
    public void testSearchWords() {
        Assert.assertEquals(Task.searchWords("asd1234"), "[asd]");
        Assert.assertEquals(Task.searchWords("asd12dfg fj"), "[asd, dfg, fj]");
    }
}
