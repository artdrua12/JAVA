package main.homework.lesson10;

import org.junit.*;

import org.junit.Assert;
import org.junit.Test;

public class SummaTest {

    @Test
    public void test() {
        Summa summa = new Summa();
        Assert.assertEquals(summa.summ(1, 2), 3);
        Assert.assertEquals(summa.summ(-1, 2), 1);
        Assert.assertEquals(summa.summ(0, 3), 3);
    }

}
