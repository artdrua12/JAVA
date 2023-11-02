package main.homework.lesson12;

public class App {
    public static void main(String[] args) {
        try {
            Person.checkPerson("d asasasfaasf", " Fjdd", " Fjdd");
        } catch (WrongLogin e) {
            System.out.println(e);
        }

    }
}
