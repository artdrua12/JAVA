package main.homework.lesson32;

import main.homework.lesson32.frontControler.FrontController;
import main.homework.lesson32.strategy.BubbleSortStrategy;
import main.homework.lesson32.strategy.Sorter;

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
    }
}
