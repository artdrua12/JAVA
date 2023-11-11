package main.homework.controlWork1;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;

public class Entrance {

    static Supplier<Integer> enter = () -> {
        try (Scanner scaner = new Scanner(System.in)) {

            System.out.println("Введите число для работы");
            System.out.println("1 - вызов операции парсинга файлов перевода из input,");
            System.out.println("2 - вызов операции вывода списка всех переводов из файла-отчета.");
            System.out.println("3 - выход из программы");

            while (scaner.hasNext()) {

                String str = scaner.nextLine();

                try {
                    int value = Integer.parseInt(str.trim());
                    if (value == 1) {
                        System.out.println("1");
                        return 1;
                    } else if (value == 2) {
                        System.out.println("2");
                        return 2;
                    } else if (value == 3) {
                        System.out.println("exit");
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

    static Function<Integer, String> patch = (num) -> {
        return num == 2 ? "Java/src/main/homework/controlWork1/archive/" : "Java/src/main/homework/controlWork1/input/";
    };


}
