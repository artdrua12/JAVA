package main.homework.lesson31;

import main.homework.lesson31.adapter.Adapter;
import main.homework.lesson31.adapter.MemoryCard;
import main.homework.lesson31.decorator.Coffee;
import main.homework.lesson31.decorator.MilkCofee;
import main.homework.lesson31.decorator.SimpleCoffee;
import main.homework.lesson31.decorator.VanilaCoffee;
import main.homework.lesson31.fasade.Computer;
import main.homework.lesson31.fasade.ComputerFasade;

public class App {
    public static void main(String[] args) {

        // Adapter
        System.out.println("Патерн Adapter");
        MemoryCard card = new MemoryCard();
        Adapter adapter = new Adapter(card);
        adapter.connectionWitchUSBCable();

        // Fasade
        System.out.println("\nПатерн Fasade");
        ComputerFasade myComputer = new ComputerFasade(new Computer());
        myComputer.turnOn();
        myComputer.turnOff();

        // Decorator
        System.out.println("\nПатерн Decorator");
        Coffee coffee = new SimpleCoffee();
        System.out.println("Price " + coffee.getCost() + " " + coffee.getDescription());

        coffee = new MilkCofee(coffee);
        System.out.println("Price " + coffee.getCost() + " " + coffee.getDescription());

        coffee = new VanilaCoffee(coffee);
        System.out.println("Price " + coffee.getCost() + " " + coffee.getDescription());

    }
}
