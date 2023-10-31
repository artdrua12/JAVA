package main.homework.lesson9.part1;

public class Booker implements JobTitle {
    private String name;

    public Booker(String name) {
        this.name = name;
    }

    @Override
    public void printJob() {
        System.out.println(this.name + " работает бухгалтером");
    }

}
