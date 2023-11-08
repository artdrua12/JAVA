package main.homework.lesson11;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите строку");
        String line = scaner.nextLine();
        System.out.println("Слова в строке " + Task.searchWords(line));

        System.out.println("Введите строку для задачи со звездочкой");
        String line2 = scaner.nextLine();
        // String line2 =
        // "fg+(375)5048175567dgf7777-5555-55hkgvh0000-4444-88hhh+(23)1234567csdc5555-5555-44
        // art@rambler.ru";
        System.out.println(TaskSuperStar.searchSuperStar(line2));

        scaner.close();

    }
}
