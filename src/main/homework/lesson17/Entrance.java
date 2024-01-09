package main.homework.lesson17;

import java.util.Scanner;
import java.util.function.Supplier;

public class Entrance {
    static Supplier<Integer> enter = () -> {
        try (Scanner scaner = new Scanner(System.in)) {

            System.out.println("Введите число для работы");
            System.out.println("1 - распарсить документ с помощью SAX");
            System.out.println("2 - распарсить документ с помощью DOM.");
            System.out.println("3 - выход из программы");

            while (scaner.hasNext()) {

                String str = scaner.nextLine();

                try {
                    int value = Integer.parseInt(str.trim());
                    if (value == 1) {
                        System.out.println("SAX-парсер");
                        return 1;
                    } else if (value == 2) {
                        System.out.println("DOM-парсер");
                        return 2;
                    } else if (value == 3) {
                        System.out.println("программа завершила работу.");
                        return 3;
                    } else {
                        System.out.println("Введите число от 1 до 3");
                    }
                } catch (Exception e) {
                    System.out.println("Введите пожалуйста число!");
                }
            }

        }
        return 3;
    };
}
