package main.homework.lesson15;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {

        // Задание1
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите дату рождения в числовом формате день месяц год(4цифры)");
        String line = scaner.nextLine();
        scaner.close();
        System.out.println("Через 100 лет после вашего рождения будет " + Addition.plus100(line));

        int[] array = new int[] { 1, 2, 3, -2, -3 };

        List<int[]> names = Arrays.asList(array);
        Predicate<Integer> positive = s -> s > 0;
        System.out.println(positive.test(-6));

    }
}
