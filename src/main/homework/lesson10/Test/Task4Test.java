package main.homework.lesson10.Test;

import org.junit.Assert;
import org.junit.Test;

import main.homework.lesson10.Task4;

public class Task4Test {
    @Test
    public void testDifferent() {
        Assert.assertEquals(Task4.different(new String[] { "12", "123", "1234" }), "12");
        Assert.assertEquals(Task4.different(new String[] { "122", "1233", "11234" }),
                "Строки состоящей из различных символов нет");

    }
}
