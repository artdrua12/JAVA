package main.homework.lesson31.fasade;

public class Computer {

    public void startPower() {
        System.out.println("Запуск блока питания");
    }

    public void sheckSystem() {
        System.out.println("проверка работоспособности всех компонентов");
    }

    public void sound() {
        System.out.println("пип пип");
    }

    public void startWindows() {
        System.out.println("Запуск опериционной системы");
    }

    // --------

    public void endWindows() {
        System.out.println("Выключение опериционной системы");
    }
    public void endPower() {
        System.out.println("Выключение блока питания");
    }
}
