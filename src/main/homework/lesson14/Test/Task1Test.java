package main.homework.lesson14.Test;

import org.junit.Assert;
import org.junit.Test;

import main.homework.lesson14.Task1;

public class Task1Test {
    @Test
    public void testSingle() {
        Assert.assertEquals(Task1.single("1 1 1 2 3"), "[1, 2, 3]");
        Assert.assertEquals(Task1.single("1, 1,   1, 2 3"), "[1, 2, 3]");
        Assert.assertEquals(Task1.single("1, dads, 1das, 2dd 3e"), "[1, 2, 3]");
    }
}
