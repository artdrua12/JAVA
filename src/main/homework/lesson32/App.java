package main.homework.lesson32;

import main.homework.lesson32.frontControler.FrontController;
import main.homework.lesson32.override.Person;
import main.homework.lesson32.strategy.BubbleSortStrategy;
import main.homework.lesson32.strategy.Sorter;
//Реализовать frontController, Стратегию,DTO,переопределить toString hashCode equals
public class App {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
        frontController.dispatchRequest("DASHBOARD");
        frontController.dispatchRequest("ERROR");

        // Стратегия
        System.out.println("\n Strategy");
        Sorter sorter = new Sorter(new BubbleSortStrategy());
        sorter.sort();

        // Переопределение toString
        System.out.println("\n Переопределение toString");
        Person vasia = new Person("Vasia", 26);
        System.out.println(vasia);
        // Переопределение hashCode
        System.out.println("\n Переопределение hashCode");
        System.out.println(vasia.hashCode());
        // Переопределение equals
        System.out.println("\n Переопределение equals");
        Person vasia2 = new Person("Vasia", 26);
        System.out.println(vasia.equals(vasia2));
    }
}
