package main.homework.lesson10;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите три строки");
        String array[] = new String[3];

        array[0] = scaner.nextLine();
        array[1] = scaner.nextLine();
        array[2] = scaner.nextLine();

        // Задача_1
        System.out.println("\nЗадание_1");
        Task1.longLine(array);
        Task1.shortLine(array);

        // Задача_2
        System.out.println("\nЗадание_2");
        System.out.println("Упорядоченые строки " + Arrays.toString(Task2.sort(array)) + "\n");

        // Задача_3
        System.out.println("\nЗадание_3");
        System.out.println(Task3.average(array));

        // Задача_4
        System.out.println("\nЗадание_4");
        System.out.println("Строка состоящая из различных символов " + Task4.different(array) + '\n');

        // Задача_5
        System.out.println("\nЗадание_5");
        System.out.println("Двойная строка " + Task5.two(array));

        // Задача_*
        System.out.println("\nЗадание_*");
        System.out.println("Введите строку");
        String line = scaner.nextLine();
        System.out.println("Введите число, какое слово будет проверено на полиндром");
        int num = scaner.nextInt() - 1;

        System.out.println(TaskStar.polindrom(line, num));

        scaner.close();
    }
}
