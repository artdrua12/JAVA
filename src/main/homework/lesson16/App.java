package main.homework.lesson16;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        // Задание1
        System.out.println("Введите числа в поток через пробел. 0 - завершение ввода");
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Integer> list = (ArrayList<Integer>) Stream.generate(scanner::nextInt)
                    .takeWhile(s -> s != 0)
                    .map(Integer::valueOf)
                    .filter(el -> el % 2 == 0)
                    .distinct()
                    .collect(Collectors.toList());

            Integer summa = list.stream().reduce(0, (subtotal, element) -> subtotal +
                    element);
            System.out.println("Задание1 = cумма коллекции " + summa + " коллекция " + list);
        }

        // Задание 2
        List<Developer> list = new ArrayList<>();
        list.add(new Developer("Anna", 11));
        list.add(new Developer("Ankma", 13));
        list.add(new Developer("Anna", 1));
        list.add(new Developer("Sasha", 12));
        list.add(new Developer("Pasha", 14));
        list.add(new Developer("Alla", 15));

        List<Developer> newList = list.stream().filter(dev -> dev.id > 10).filter(dev -> dev.name.startsWith("An"))
                .collect(Collectors.toList());

        System.out.print("Задание2 = ");
        for (Developer dev : newList) {
            System.out.print(dev.name + " " + dev.id + " ");
        }

        // Задание со *
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "123");
        myMap.put(2, "345");
        myMap.put(3, "5678910");
        myMap.put(4, "78910");
        myMap.put(5, "nopq");
        myMap.put(6, "rst");
        myMap.put(7, "uvw");
        myMap.put(8, "xyz");
        myMap.put(9, "axyz");
        myMap.put(10, "10");
        myMap.put(11, "11");
        myMap.put(12, "12");
        myMap.put(13, "13");
        myMap.put(14, "14");

        List<String> isbnCodes = myMap.entrySet().stream().filter(key -> key.getKey() % 2 != 0)
                .filter(value -> value.getValue().length() % 2 != 0)
                .map(value -> {
                    return new StringBuffer(value.getValue()).reverse();
                })
                .map(String::valueOf).collect(Collectors.toList());

        System.out.println("\nЗадание со * = keys" + isbnCodes);
    }
}
