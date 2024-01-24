package main.homework.lesson6;

public class App {
    // Создать класс CreditCard c полями номер счета, текущая сумма на счету.
    // Добавьте
    // метод, который позволяет начислять сумму на кредитную карточку. Добавьте
    // метод,
    // который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
    // выводит текущую информацию о карточке. Напишите программу, которая создает
    // три
    // объекта класса CreditCard у которых заданы номер счета и начальная сумма.
    // Тестовый сценарий для проверки: Положите деньги на первые две карточки и
    // снимите с
    // третьей. Выведите на экран текущее состояние всех трех карточек
    public static void main(String[] args) throws Exception {
        // Задание 1
        Calculator card = new Calculator(6, 2);
        card.all();

        // Задание 2
        Person person = new Person();
        person.talk("hello word");

        Person personTwo = new Person("Вася", 25);
        personTwo.move();

        // Задание 2
        CreditCard cardOne = new CreditCard(100, "3sf46256642637");
        CreditCard cardTwo = new CreditCard(200, "65675dffd475784");
        CreditCard cardThree = new CreditCard(300, "7647857ddf856845");

        cardOne.add(150);
        cardTwo.add(200);
        cardThree.takeOff(20);

        cardOne.information();
        cardTwo.information();
        cardThree.information();

    }

}
