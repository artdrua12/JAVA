package main.homework.lesson9.part2;

public class Triangle extends Figure {

    Triangle(int a, int b) {
        super(a, b);
        // TODO Auto-generated constructor stub
    }

    @Override
    double area() {
        System.out.println("Площать треугольника");
        return (a * b) / 2;
    }

    @Override
    double perimetr() {
        double perimetr = Math.sqrt(a * a + b * b) + a + b;
        System.out.println("Периметр треугольника " + perimetr);
        return perimetr;
    }

}
