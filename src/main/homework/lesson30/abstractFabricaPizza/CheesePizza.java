package main.homework.lesson30.abstractFabricaPizza;
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare cheese pizza");
    }
}
