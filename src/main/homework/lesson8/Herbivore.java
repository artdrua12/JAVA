package main.homework.lesson8;

public class Herbivore extends Animal {

    public void eat(String food, String animal) {
        if (API.capitalize(food).equals("Grass")) {
            System.out.println(animal + " животное травоядное и любит есть" + food);
        } else {
            System.out.println(animal + " животное травоядное, поэтому не любит " + food);
        }
    }

    public void voice() {
        System.out.println(" Травоядное животное издает звук");
    }

}
