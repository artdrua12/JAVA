package main.homework.lesson18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        // try (Scanner scaner = new Scanner(System.in)) {
        // System.out.println("Введите числа в массив. Ввод не числа - окончание
        // ввода.");

        // while (scaner.hasNextInt()) {
        // int val = scaner.nextInt();
        // list.add(val);
        // }
        // }
        MyThread thread = new MyThread(new Integer[] { 1, 5, 3, 2, 4 });
        thread.start();
        Integer[] d = thread.print();

        for (int i : d) {
            System.out.println(i);
        }
        // System.out.println(list.toString());
    }
}
