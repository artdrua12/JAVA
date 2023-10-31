package main.homework.lesson8;

public class Сarnivore extends Animal {

    public void eat(String food, String animal) {
        if (API.capitalize(food).equals("Meat")) {
            System.out.println(animal + " животное плотоядное и любит есть " + food);
        } else {
            System.out.println(animal + " животное плотоядное, поэтому не любит " + food);
        }
    }

    public void voice() {
        System.out.println(" Плотоядное животное издает звук");
    }

}
