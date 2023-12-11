package main.homework.lesson12;

// Задача 1:
// Создать класс, в котором будет статический метод. Этот метод принимает на вход три
// параметра: login, password, confirmPassword. Все поля имеют тип данных String. Длина
// login должна быть меньше 20 символов и не должен содержать пробелы. Если login не
// соответствует этим требованиям, необходимо выбросить WrongLoginException. Длина
// password должна быть меньше 20 символов, не должен содержать пробелом и должен
// teachmeskills.by
// содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.
// Если password не соответствует этим требованиям, необходимо выбросить
// WrongPasswordException. WrongPasswordException и WrongLoginException -
// пользовательские классы исключения с двумя конструкторами – один по умолчанию,
// второй принимает сообщение исключения и передает его в конструктор класса Exception.
// Метод возвращает true, если значения верны, false в противном случае.
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
