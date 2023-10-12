package main.homework.lesson8;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("LESSON 8\n");

        Dog dog = new Dog("Шарик");
        dog.feedAnimal("meat");
        dog.feedAnimal("grass");

        Tiger tiger = new Tiger("Вася");
        tiger.feedAnimal("meat");
        tiger.feedAnimal("grass");

        Rabbit rabbit = new Rabbit("Бани");
        rabbit.feedAnimal("Meat");
        rabbit.feedAnimal("Grass");

    }
}
