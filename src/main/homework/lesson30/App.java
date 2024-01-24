package main.homework.lesson30;

import java.sql.Connection;
import java.sql.SQLException;

import main.homework.lesson30.abstractFabrica.CarsFactory;
import main.homework.lesson30.abstractFabrica.ToyotaFactory;
import main.homework.lesson30.abstractFabricaPizza.MozurPizzaFactory;
import main.homework.lesson30.abstractFabricaPizza.PizzaStore;
import main.homework.lesson30.builder.Airplane;
import main.homework.lesson30.fabrica.Doughnut;
import main.homework.lesson30.fabrica.DoughnutFactory;
import main.homework.lesson30.singlton.Singlton;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Singlton
        Singlton instance = Singlton.getInstance();
        Connection conn = instance.getConnection();
        System.out.println(conn);

        // Abstract Fabrica Car
        System.out.println("\nAbstract Fabrica Car");
        CarsFactory factory = new ToyotaFactory();
        factory.createCoupe();

        System.out.println("\nAbstract Fabrica Pizza");
        PizzaStore mozStore = new MozurPizzaFactory();
        mozStore.orderPizza("cheese");

        // Fabrica
        System.out.println("\nFabrica");
        DoughnutFactory work = new DoughnutFactory();
        Doughnut chocolate = work.getDoughnut("CHOCOLATE");
        chocolate.eat();

        // Builder
        System.out.println("\nBuilder");

        var plane = new Airplane.Builder("Aerobus").addType("passenger").addCountMan(120).build();
    }
}
