package main.homework.lesson30.abstractFabrica;

public class ToyotaFactory implements CarsFactory {

    @Override
    public Sedan createSedan() {
        return new ToyotaSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new ToyotaCoupe();
    }

}
