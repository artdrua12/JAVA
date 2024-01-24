package main.homework.lesson8;

public class App {
    // Задача 1:
    // Создать логически верную иерархию следующих классов: Animal, Dog, Tiger,
    // Rabbit.
    // Переопределить методы voice(), eat(String food) чтобы они выводили верную
    // информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
    // Например, если мы создадим объект класса Rabbit, вызовем метод eat() и
    // передадим
    // туда “Grass” он должен написать в консоли что любит есть травку. Если
    // передадим “Meat”
    // или другую строку то он будет недоволен.
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
