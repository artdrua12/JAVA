package main.homework.lesson9.part2;

public class Rectangle extends Figure {

    Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Площать четырехугольника");
        return a * b;
    }

    @Override
    double perimetr() {
        double perimetr = (a + b) * 2;
        System.out.println("Периметр четырехугольника " + perimetr);
        return perimetr;
    }

}
