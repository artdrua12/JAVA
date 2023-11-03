package main.homework.lesson12.Test;

import org.junit.Assert;
import org.junit.Test;

import main.homework.lesson12.Person;
import main.homework.lesson12.WrongLogin;
import main.homework.lesson12.WrongPassword;

public class PersonTest {
    @Test(expected = WrongLogin.class)
    public void testCheckPerson() throws WrongLogin, WrongPassword {
        Person.checkPerson(" Oleg", "qwer1", "qwer1");
    }

    @Test(expected = WrongPassword.class)
    public void testCheckPerson2() throws WrongLogin, WrongPassword {
        Person.checkPerson("Oleg", "qwer1", "q");
    }
        @Test(expected = WrongPassword.class)
    public void testCheckPerson3() throws WrongLogin, WrongPassword {
        Person.checkPerson("Oleg", "qwer", "qwer");
    }
        @Test(expected = WrongPassword.class)
    public void testCheckPerson4() throws WrongLogin, WrongPassword {
        Person.checkPerson("Oleg", "abcdefghijklmn123456789", "abcdefghijklmn123456789");
    }
}
