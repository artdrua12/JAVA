
package main.homework.lesson30.abstractFabricaPizza;
public class MinskPizzaFactory extends PizzaStore {

    @Override
    Pizza creatPizza(String type) {
        if (type.equals("cheese")) {
            return new MinskStyleCheesePizza();
        } else {
            return new MinskStylePepperoniPizza();
        }
    }

}
