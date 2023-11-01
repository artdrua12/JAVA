package main.homework.lesson12.Test;

import org.junit.Assert;
import org.junit.Test;

import main.homework.lesson12.Person;
import main.homework.lesson12.WrongLogin;
import main.homework.lesson12.WrongPassword;

public class PersonTest {
    @Test
    public void testCheckPerson() throws WrongLogin, WrongPassword {
        Assert.assertEquals(Person.checkPerson("Oleg", "qwer1", "qwer1"), "Проверка пройдена");
    }
}
