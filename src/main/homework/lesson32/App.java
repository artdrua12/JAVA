package main.homework.lesson32;

import main.homework.lesson32.frontControler.FrontController;

public class App {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
        frontController.dispatchRequest("DASHBOARD");
        frontController.dispatchRequest("ERROR");
    }
}
