package main.homework.lesson9.part1;

public class App {
    // Задача 1:
    // Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с
    // методом,
    // который печатает название должности и имплементировать этот метод в созданные
    // классы
    public static void main(String[] args) throws Exception {
        Director director = new Director("Александр");
        director.printJob();

        Worker worker = new Worker("Вася");
        worker.printJob();

        Booker booker = new Booker("Ольга");
        booker.printJob();
    }
}
