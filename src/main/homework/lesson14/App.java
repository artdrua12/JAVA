package main.homework.lesson14;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите числа через пробел");
        String line = scaner.nextLine();
        System.out.println("Задание 1: " + line + " => " + Task1.single(line));
        scaner.close();

        // Задание2
        Task2.add("Мишка");
        Task2.add("Лисичка");
        Task2.add("Зайчик");
        System.out.println(Task2.show());
        Task2.remove();
        System.out.println(Task2.show());
    }
}
