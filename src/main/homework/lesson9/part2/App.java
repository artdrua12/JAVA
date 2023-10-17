package main.homework.lesson9.part2;

public class App {
    public static void main(String[] args) throws Exception {

        Figure[] array = new Figure[] {
                new Rectangle(2, 4), new Triangle(2, 4), new Elipce(2, 4), new Rectangle(4, 8), new Triangle(4, 8)
        };

        double summa = 0;

        for (int i = 0; i < array.length; i++) {
            summa += array[i].perimetr();
        }

        System.out.println("Периметр всех фигур равен " + String.format("%.3f", summa));
    }
}
