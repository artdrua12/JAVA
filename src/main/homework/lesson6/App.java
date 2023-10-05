package main.homework.lesson6;

public class App {
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
