package main.homework.lesson13.Test;

import org.junit.Assert;
import org.junit.Test;

import main.homework.lesson13.Find;

public class FindTest {
    @Test
    public void testFindLongWord() {
        Assert.assertEquals(Find.findLongWord("abc abcd abcdef", "abcd"), "abcdef");
        Assert.assertEquals(Find.findLongWord("abc abcd abcdef", "abcddefgh"), "abcddefgh");
        Assert.assertEquals(Find.findLongWord("abc abcd abcdef", ""), "abcdef");
        Assert.assertEquals(Find.findLongWord("Мама мыла раму", ""), "Мама");
    }
}
