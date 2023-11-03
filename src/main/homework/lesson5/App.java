package main.homework.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int twoArray[][] = new int[2][2];
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++)
                twoArray[i][j] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.deepToString(twoArray));
        // Задача1
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите число которое будет добавлено к элементам массива");
        int value = scaner.nextInt();
        int summa = 0;
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                twoArray[i][j] += value;
                summa += twoArray[i][j];
            }

        }
        System.out.println("Задача 1 \n" + Arrays.deepToString(twoArray));
        System.out.println("Cумма элементов = " + summa);

        // Задача2
        char chessArray[][] = new char[8][8];
        for (int i = 0; i < chessArray.length; i++) {
            for (int j = 0; j < chessArray[i].length; j++)
                if ((i + j) % 2 == 0) {
                    chessArray[i][j] = 'W';
                } else {
                    chessArray[i][j] = 'B';
                }
        }
        System.out.println("Задача 2");
        for (int i = 0; i < chessArray.length; i++) {
            System.out.println(Arrays.toString(chessArray[i]));
        }

        System.out.println("Задание* : Введите размерность массива n");
        int n = scaner.nextInt();
        System.out.println("Задание* : Введите размерность массива m");
        int m = scaner.nextInt();

        String snake[][] = new String[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) {
                    snake[i][j] = String.format("%03d", (i * m) + j);
                } else {
                    snake[i][m - j - 1] = String.format("%03d", (i * m) + j);
                }

            }

        }
        System.out.println("Массив змейкой");
        for (int i = 0; i < snake.length; i++) {
            System.out.println(Arrays.toString(snake[i]));

        }
        scaner.close();
    }
}
