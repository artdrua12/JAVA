package main.homework.lesson10;

import java.lang.reflect.Array;
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
        String strMax = array[0];
        String strMin = array[0];

        int max = array[0].length();
        int min = array[0].length();

        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > max) {
                max = array[i].length();
                strMax = array[i];
            } else if (array[i].length() < min) {
                min = array[i].length();
                strMin = array[i];
            }
        }
        System.out.println("\nЗадание_1");
        System.out.println("Самая длинная строка " + strMax + " длина " + max);
        System.out.println("Самая короткая строка " + strMin + " длина " + min + "\n");

        // Задача_2
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i].length() > array[j].length()) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Задание_2");
        System.out.println("Упорядоченые строки " + Arrays.toString(array) + "\n");

        // Задача_3
        System.out.println("Задание_3");
        if (array[0].length() < array[1].length()) {
            System.out
                    .println("Строки длина которых меньше средней " + array[0] + " длина " + array[0].length() + '\n');
        } else {
            System.out.println("Строки, которая меньше средней, нет \n");
        }

        // Задача_4
        System.out.println("Задание_4");
        for (int i = 0; i < array.length; i++) {
            char[] result = array[i].toCharArray();
            boolean isGood = true;
            for (int j = 0; j < result.length; j++) {
                if (array[i].indexOf(result[j], j + 1) > -1) {
                    System.out.println("result[j]" + array[i].indexOf(result[j], j));
                    isGood = false;
                    continue;
                }
                if (isGood) {
                    System.out.println("Строка состоящая из различных символов " + array[i] + '\n');
                    System.out.println("good" + array[i]);
                    break;
                } else {
                    isGood = true;
                }
            }

        }

    }
}
