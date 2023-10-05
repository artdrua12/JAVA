package main.homework.lesson6;

public class Person {

    String fullname;
    int age;

    Person() {
        System.out.println("Конструктор по умолчанию");
    }

    Person(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public void talk(String text) {
        System.out.println("Вывод сообщения из класса Person " + text);
    }

    public void move() {
        System.out.println("Класс Person fullname = " + fullname + " возраст " + age);
    }

}
