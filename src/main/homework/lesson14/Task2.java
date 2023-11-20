package main.homework.lesson14;

import java.util.LinkedList;

public class Task2 {
    public static LinkedList<String> animals = new LinkedList<>();

    public static void add(String animal) {
        animals.addFirst(animal);
    }

    public static void remove() {
        animals.removeLast();
    }

    public static String show() {
        return animals.toString();
    }
}
