package main.homework.lesson10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Scanner scaner = new Scanner(System.in);
        // System.out.println("Введите три строки");
        String array[] = new String[3];
        array[0] = "1223";
        array[1] = "abc";
        array[2] = "ccba";
        // array[0] = scaner.nextLine();
        // array[1] = scaner.nextLine();
        // array[2] = scaner.nextLine();

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
        System.out.println("Самая короткая строка " + strMin + " длина " + min +
                "\n");

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
                    .println("Строки длина которых меньше средней " + array[0] + " длина " +
                            array[0].length() + '\n');
        } else {
            System.out.println("Строки, которая меньше средней, нет \n");
        }

        // Задача_5
        System.out.println("Задание_5");
        StringBuffer[] arrayBufer = new StringBuffer[3];
        for (int i = 0; i < array.length; i++) {
            char[] charArray = array[i].toCharArray();
            arrayBufer[i] = new StringBuffer(array[i]);
            for (int j = 0; j < charArray.length; j++) {
                arrayBufer[i].insert(j * 2, charArray[j]);
            }
            System.out.println(arrayBufer[i].toString());
        }
        System.out.println();

        // Задача_4
        System.out.println("Задание_4");
        for (int i = 0; i < array.length; i++) {
            char[] charArray = array[i].toCharArray();

            for (int j = 0; j < charArray.length; j++) {
                if (array[i].indexOf(charArray[j], j + 1) > -1) {
                    break;
                }
                if (j == charArray.length - 1) {
                    System.out.println("Строка состоящая из различных символов " + array[i]);
                    return;
                }
            }
        }

    }
}
