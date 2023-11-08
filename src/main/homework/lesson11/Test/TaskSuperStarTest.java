package main.homework.lesson11.Test;

import org.junit.Assert;
import org.junit.Test;

import main.homework.lesson11.TaskSuperStar;

public class TaskSuperStarTest {
    @Test
    public void testSearchSuperStar() {
        Assert.assertEquals(TaskSuperStar.searchSuperStar(
                "fg+(375)5048175567dgf7777-5555-55hkgvh0000-4444-88hhh+(23)1234567csdc5555-5555-44 art@rambler.ru"),
                "numbers = [7777-5555-55, 0000-4444-88, 5555-5555-44] phone = [+(23)1234567] email = [art@rambler.ru]");
    }
}
