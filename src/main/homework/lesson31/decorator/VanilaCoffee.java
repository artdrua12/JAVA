package main.homework.lesson31.decorator;

public class VanilaCoffee implements Coffee {

    private Coffee coffee;

    public VanilaCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 3;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + ванилин";
    }
}
