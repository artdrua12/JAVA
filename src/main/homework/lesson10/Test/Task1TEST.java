package main.homework.lesson10.Test;

import org.junit.Assert;
import org.junit.Test;

import main.homework.lesson10.Task1;

public class Task1TEST {
    @Test
    void testLongLine() {
        Assert.assertEquals(Task1.longLine(new String[] { "short", "midler", "longerer" }), "longerer");
        Assert.assertEquals(Task1.longLine(new String[] { "12", "123", "1234" }), "1234");
    }

    @Test
    void testShortLine() {
        Assert.assertEquals(Task1.shortLine(new String[] { "short", "midler", "longerer" }), "short");
        Assert.assertEquals(Task1.shortLine(new String[] { "12", "123", "1234" }), "12");
    }
}
