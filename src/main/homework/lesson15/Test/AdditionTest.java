package main.homework.lesson15.Test;

import java.util.function.Function;

import org.junit.Assert;
import org.junit.Test;

import main.homework.lesson15.Addition;

public class AdditionTest {

    @Test
    public void testConvertWitchFunction() {
        Function<String, String> f = Addition.convertWitchFunction();
        Assert.assertEquals(f.apply("300 BYN"), "100 USD");
        Assert.assertEquals(f.apply("400 BYN"), "133 USD");
    }

    @Test
    public void testPlus100() {
        Assert.assertEquals(Addition.plus100("12/03/1990"), "2090-03-12");
        Assert.assertEquals(Addition.plus100("12 03 1990"), "2090-03-12");
        Assert.assertEquals(Addition.plus100("12031990"), "2090-03-12");
        Assert.assertEquals(Addition.plus100("12-03-1990"), "2090-03-12");
        Assert.assertEquals(Addition.plus100("12.03.1990"), "2090-03-12");
    }

    @Test
    public void testPositive() {
        Assert.assertEquals(Addition.positive(new int[] { 1, 2, 3, -2, -3 }), "123");
        Assert.assertEquals(Addition.positive(new int[] { -1, -2, 3, 2, -3 }), "32");
    }

}
