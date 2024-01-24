package main.homework.lesson9.part2;

public class App {
    // Задача 2:
    // Создать абстрактный класс Computer и абстрактный метод getClassName().
    // Создать
    // классы Hp и Mac и отнаследоваться от Computer. Переопределить метод
    // getClassName()
    // в классах-наследниках так, чтобы они выводили сообщения «I’m HP» или «I’m
    // Mac». В
    // методе main класса Main создать объекты классов Hp Mac и вызвать методы для
    // каждого
    // из этих объектов
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
