package main.homework.controlWork1;

import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
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
                        break;
                    } else if (value == 2) {
                        System.out.println("2");
                        break;
                    } else if (value == 3) {
                        System.out.println("exit");
                        return;
                    } else {
                        System.out.println("Введите число от 1 до 3");
                    }
                } catch (Exception e) {
                    System.out.println("Введите пожалуйста число");
                }
            }

        } 

        File folder = new File("Java/src/main/homework/controlWork1/input/");

        // печать списка файлов на экран
        for (File file : folder.listFiles()) {
            System.out.println(file.getName());
            Path p = file.toPath();
            Additional.readFile(p);
        }
    }

}
