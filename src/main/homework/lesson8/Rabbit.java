package main.homework.lesson8;

public class Rabbit extends Herbivore {

    final private String kindOfAnimal = "кролик ";
    private String name;

    public Rabbit(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println(kindOfAnimal + " " + name + " пищит\n");
    }

    public void feedAnimal(String food) {
        System.out.println("Вы кормите " + kindOfAnimal + " " + name);
        super.eat(food, this.kindOfAnimal);
        System.out.print("После еды ");
        this.voice();
    }
}
