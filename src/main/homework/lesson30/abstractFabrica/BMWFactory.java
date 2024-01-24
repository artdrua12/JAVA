package main.homework.lesson30.abstractFabrica;

public class BMWFactory implements CarsFactory {

    @Override
    public Sedan createSedan() {
        return new BMWSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new BMWCoupe();
    }

}
