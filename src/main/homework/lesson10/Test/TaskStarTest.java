package main.homework.lesson10.Test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.homework.lesson10.TaskStar;

public class TaskStarTest {
    @Test
    void testPolindrom() {
        Assert.assertEquals(TaskStar.polindrom("1221 123",0), "1221 полиндром");
        Assert.assertEquals(TaskStar.polindrom("1221 123",1), "123 не является полиндромом");
    }
}
