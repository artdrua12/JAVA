package main.homework.lesson8;

public class Tiger extends Сarnivore {

    final private String kindOfAnimal = "тигр";
    private String name;

    public Tiger(String name) {

        this.name = name;
    }

    public void voice() {
        System.out.println(kindOfAnimal + " " + name + " рычит\n");
    }

    public void feedAnimal(String food) {
        System.out.println("Вы кормите " + kindOfAnimal + " " + name);
        super.eat(food, this.kindOfAnimal);
        System.out.print("После еды ");
        this.voice();
    }

}
