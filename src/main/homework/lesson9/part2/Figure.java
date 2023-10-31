package main.homework.lesson9.part2;

public abstract class Figure {
    int a;
    int b;

    Figure(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract double area();

    abstract double perimetr();
    
}
