package main.homework.lesson8;

public class Omnivore extends Animal {

    public void eat(String food, String animal) {

        System.out.println(animal + " животное всеядное поэтому может есть " + food );

    }
    public void voice() {
        System.out.println(" Всеядное животное издает звук!");
    }
}
