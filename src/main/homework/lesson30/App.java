package main.homework.lesson30;

import java.sql.Connection;
import java.sql.SQLException;

import main.homework.lesson30.abstractFabrica.CarsFactory;
import main.homework.lesson30.abstractFabrica.ToyotaFactory;
import main.homework.lesson30.abstractFabricaPizza.MozurPizzaFactory;
import main.homework.lesson30.abstractFabricaPizza.PizzaStore;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Singlton
        Singlton instance = Singlton.getInstance();
        Connection conn = instance.getConnection();
        System.out.println(conn);

        // Abstract Fabrica Car
        CarsFactory factory = new ToyotaFactory();
        factory.createCoupe();

        PizzaStore mozStore = new MozurPizzaFactory();
        mozStore.orderPizza("cheese");
    }
}
