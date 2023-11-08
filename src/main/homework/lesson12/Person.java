package main.homework.lesson12;

import java.util.regex.Pattern;

public class Person {

    public Person() {
    }

    static void checkPerson(String login, String password, String confirmPassword) throws WrongLogin {
        if (login.length() >= 20) {
            throw new WrongLogin("Длина не должна быть более 20 символов");
        }
        if (Pattern.matches("[a-zA-Zа-яА-Я]{0,}\\s+[a-zA-Zа-яА-Я]{0,}", login)) {
            throw new WrongLogin("Логин не должен содержать пробелов");
        }
    }

}
