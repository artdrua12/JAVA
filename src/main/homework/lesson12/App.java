package main.homework.lesson12;

import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        try {
            Person.checkPerson("d asasasfaasf", " Fjdd", " Fjdd");
        } catch (WrongLogin e) {
            System.out.println(e);
        }

    }
}
