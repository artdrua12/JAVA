package main.homework.lesson9.part1;

public class Worker implements JobTitle {

    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void printJob() {
        System.out.println(this.name + " работает в строительстве");
    }

}
