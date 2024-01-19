package main.homework.lesson31.decorator;

public class MilkCofee implements Coffee {
    private Coffee coffee;

    public MilkCofee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + молоко";
    }
}
