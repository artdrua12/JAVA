package main.homework.lesson14.Test;

import org.junit.Assert;
import org.junit.Test;

import main.homework.lesson14.Student;

public class StudentTest {
    @Test
    public void testAverage() {
        Student student = new Student("Vasa", 1, 351002, new int[] { 1, 4, 3, 4 });
        Assert.assertEquals(student.average(), 3);

    }

    @Test
    public void testIsStudent() {
        Student studentSecond = new Student("Vasa", 1, 351002, new int[] { 1, 4, 3, 4 });
        Assert.assertEquals(studentSecond.isStudent(3), true);
    }
}
