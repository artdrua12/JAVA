package main.homework.lesson31.decorator;

public class SimpleCoffee implements Coffee {

    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Простой кофе";
    }

}
