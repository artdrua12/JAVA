package main.homework.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    // Задача 1:
    // 1.1 Создать двумерный массив, заполнить его случайными числами.
    // 1.2 Добавить к каждому значению число, которое пользователь будет вводить с
    // консоли.
    // 1.3 Найти сумму всех получившихся элементов и вывести в консоль.
    // Задача 2:
    // Создать программу для раскраски шахматной доски с помощью цикла. Создать
    // двумерный массив String 8х8. С помощью циклов задать элементам массива
    // значения
    // B(Black) или W(White). При выводе результат работы программы должен быть
    // teachmeskills.by
    // следующим:
    // W B W B W B W B
    // B W B W B W B W
    // W B W B W B W B
    // B W B W B W B W
    // W B W B W B W B
    // B W B W B W B W
    // W B W B W B W B
    // B W B W B W B W
    // Задача *:
    // Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой.
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
