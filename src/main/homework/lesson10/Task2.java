package main.homework.lesson10;

import java.util.Arrays;

public class Task2 {
    static String[] sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i].length() > array[j].length()) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Упорядоченые строки " + Arrays.toString(array) + "\n");

        return array;
    }

}
