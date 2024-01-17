package main.homework.lesson30.abstractFabricaPizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = creatPizza(type);
        pizza.prepare();

        return pizza;
    }

    abstract Pizza creatPizza(String type);
}
