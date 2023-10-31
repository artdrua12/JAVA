package main.homework.lesson9.part1;

public class Director implements JobTitle {

    private String name;

    public Director(String name) {
        this.name = name;
    }

    @Override
    public void printJob() {
        System.out.println(this.name + " работает директором");
    }

}
