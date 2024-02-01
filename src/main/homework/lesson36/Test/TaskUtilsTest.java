package main.homework.lesson36.Test;

import org.junit.Assert;
import org.junit.Test;

import main.homework.lesson36.TaskUtils;

public class TaskUtilsTest {
    @Test
    public void testTask1() {
        Assert.assertEquals(TaskUtils.task1(new String[] { "a", "b", "c", "a" }).toString(),
                "{a=true, b=false, c=false}");
        Assert.assertEquals(TaskUtils.task1(new String[] { "c", "b", "a" }).toString(), "{a=false, b=false, c=false}");
        Assert.assertEquals(TaskUtils.task1(new String[] { "c", "c", "c", "c" }).toString(), "{c=true}");
    }

    @Test
    public void testTask2() {
        Assert.assertEquals(TaskUtils.task2(new String[] { "man", "moon", "good", "night" }).toString(),
                "{g=d, m=n, n=t}");
        Assert.assertEquals(TaskUtils.task2(new String[] { "man", "moon", "main" }).toString(),
                "{m=n}");
        Assert.assertEquals(TaskUtils.task2(new String[] { "code", "bug" }).toString(),
                "{b=g, c=e}");
    }
}
