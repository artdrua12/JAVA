package main.homework.lesson10.Test;

import org.junit.Assert;
import org.junit.Test;

import main.homework.lesson10.Task2;

public class Task2TEST {
    @Test
    public void testSort() {
        Assert.assertArrayEquals(Task2.sort(new String[] { "midler", "short", "longerer" }),
                new String[] { "short", "midler", "longerer" });

        Assert.assertArrayEquals(Task2.sort(new String[] { "123", "1234", "12" }),
                new String[] { "12", "123", "1234" });
    }
}
