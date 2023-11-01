package main.homework.lesson12;


public class App {
    public static void main(String[] args) {
        try {
            Person.checkPerson("Oleg", "2Fjdd", "2Fjdd");
             System.out.println("Проверка пройдена");
        } catch (WrongLogin e) {
            System.out.println(e);
        } catch (WrongPassword e) {
            System.out.println("Ошибка в пароле");
        }

    }
}
