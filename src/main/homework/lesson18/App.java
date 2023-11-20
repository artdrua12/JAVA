package main.homework.lesson18;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxExpr.Array;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // List<Integer> list = new ArrayList<>();
        // try (Scanner scaner = new Scanner(System.in)) {
        // System.out.println("Введите числа в массив. Ввод не числа - окончание
        // ввода.");

        // while (scaner.hasNextInt()) {
        // int val = scaner.nextInt();
        // list.add(val);
        // }
        // }
        MyThread thread = new MyThread(new int[] { 1, 5, 3, 2, 4 });
        thread.start();
        int[] d = thread.sort("insertSort");

        for (int i : d) {
            System.out.println(i);
        }
        // System.out.println(list.toString());
        // int[] arr = new int[] { 5, 2, 4, 3 };
        // Sort.insertSort(arr);
        // System.out.println(Arrays.toString(arr));

        // int[] arr2 = new int[] { 5, 2, 4, 3 };
        // Sort.bubbleSort(arr2);
        // System.out.println(Arrays.toString(arr2));

        // int[] arr3 = new int[] { 5, 2, 4, 3 };
        // Sort.bubbleSort(arr3);
        // System.out.println(Arrays.toString(arr3));
    }
}

// Задача 1:
// Пользователь вводит с клавиатуры значение в массив. После чего запускаются
// два потока. Первый поток находит максимум в массиве, второй — минимум.
// Результаты
// вычислений возвращаются в метод main().

// Задача 2:
// Сортировка массива цифр в нескольких потоках различными алгоритмами:
//  сортировка вставками;
//  сортировка выбором;
//  сортировка пузырьком.
// Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
// результат отсортированных массивов в консоль.

// Задача *:
// Имеются сущности Магазин, Производитель, Покупатель. Цель задачи сделать так
// чтобы
// производитель произвел 5 единиц продукта, а покупатель их купил. Пока
// производитель
// не произвел продукт, покупатель не может его купить. При этом одновременно в
// магазине
// может находиться не более 3 товаров.