package main.homework.lesson10;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    // 1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
    // Вывести
    // найденные строки и их длину.
    // 2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке
    // возрастания
    // значений их длины.
    // 3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
    // меньше
    // средней, а также их длину.
    // teachmeskills.by
    // 4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных
    // символов.
    // Если таких слов несколько, найти первое из них.
    // 5. Вывести на консоль новую строку, которой задублирована каждая буква из
    // начальной строки. Например, "Hello" -> "HHeelllloo".
    // Задача *:
    // Дана строка произвольной длины с произвольными словами. Написать программу
    // для
    // проверки является ли любое выбранное слово в строке палиндромом.
    // Например, есть строка, вводится число 3, значит необходимо проверить является
    // ли 3-е
    // слово в этой строке палиндромом.
    // Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций:
    // например,
    // в строке 5 слов, а на вход программе передали число 500
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
