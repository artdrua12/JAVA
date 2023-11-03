package main.homework.lesson10.Test;

import org.junit.Assert;
import org.junit.Test;

import main.homework.lesson10.Task3;

public class Task3Test {
    @Test
    public void testAverage() {
        Assert.assertEquals(Task3.average(new String[] { "short", "midler", "longerer" }), "short");
        Assert.assertEquals(Task3.average(new String[] { "short", "short", "longerer" }), "");
    }
}
