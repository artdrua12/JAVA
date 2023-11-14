package main.homework.lesson16;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        System.out.println("Введите числа в поток \n0(с новой строчки) - завершение ввода");
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> list = Stream.generate(scanner::nextInt)
                    .takeWhile(s -> s != 0)
                    .map(Integer::valueOf)
                    .filter(el -> el % 2 == 0)
                    .distinct()
                    .collect(Collectors.toList());
            System.out.println("Отфильтрованная коллекция " + list);

            Integer summa = list.stream().reduce(0, (subtotal, element) -> subtotal + element);
            System.out.println("Сумма коллекции " + summa);
        }
    }
}
