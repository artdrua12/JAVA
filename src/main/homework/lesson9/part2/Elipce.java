package main.homework.lesson9.part2;

public class Elipce extends Figure {

    double pi = 3.14;

    Elipce(int a, int b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Площать элипса");
        return a * b * pi;
    }

    @Override
    double perimetr() {
        double perimetr = Math.sqrt((a * a + b * b) / 2) * 2 * pi;
        System.out.println("Периметр элипса " + perimetr);
        return perimetr;
    }

}
