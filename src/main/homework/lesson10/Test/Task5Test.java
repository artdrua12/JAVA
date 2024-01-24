package main.homework.lesson10.Test;

import org.junit.Assert;
import org.junit.Test;

import main.homework.lesson10.Task5;

public class Task5Test {
    @Test
    public void testTwo() {
        Assert.assertEquals(Task5.two(new String[] { "1", "12", "123" }), "[11, 1122, 112233]");
        Assert.assertEquals(Task5.two(new String[] { "1", "2", "3" }), "[11, 22, 33]");
    }

    @Test
    void testTwo2() {
        
    }
}
