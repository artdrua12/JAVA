package main.homework.lesson36;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        // Задание 1
        // На вход поступает массив строк, верните Map<String, Boolean>, где каждая
        // отдельная
        // строка является ключом, и ее значение равно true, если эта строка встречается
        // в массиве
        // 2 или более раз. Пример:
        // wordMultiple(["a", "b", "a", "c"]) → {"a": true, "b": false, "c": false}
        // wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
        // wordMultiple(["c", "c", "c", "c"]) → {"c": true}

        String[] arr = new String[] {"c", "c", "c", "c"};
        Map<String, Boolean> repeat = TaskUtils.task1(arr);
        System.out.println("Задание 1");
        System.out.println(repeat.entrySet());

        // Задание 2
        // На вход поступает массив непустых строк, создайте и верните Map<String,
        // String> следующим образом: для каждой строки добавьте ее первый символ в
        // качестве ключа с последним символом в качестве значения. Пример:
        // pairs(["code", "bug"]) → {"b": "g", "c": "e"}
        // pairs(["man", "moon", "main"]) → {"m": "n"}
        // pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
        String[] arr2 = new String[] {"code", "bug"};
        Map<String, String> map = TaskUtils.task2(arr2);
        System.out.println("Задание 1");
        System.out.println(map.entrySet());
    }
}
