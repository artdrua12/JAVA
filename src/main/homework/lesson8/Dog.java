package main.homework.lesson8;

public class Dog extends Omnivore {

    final private String kindOfAnimal = "собака";
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println(kindOfAnimal + " " + name + " лает \n");
    }

    public void feedAnimal(String food) {
        System.out.println("Вы кормите " + kindOfAnimal + " " + name);
        super.eat(food, this.kindOfAnimal);
        System.out.print("После еды ");
        this.voice();
    }

}
