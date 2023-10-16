package main.homework.lesson9;

public class App {
    public static void main(String[] args) throws Exception {
        Director director = new Director("Александр");
        director.printJob();

        Worker worker = new Worker("Вася");
        worker.printJob();

        Booker booker = new Booker("Ольга");
        booker.printJob();
    }
}
