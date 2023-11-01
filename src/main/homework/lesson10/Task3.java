package main.homework.lesson10;

public class Task3 {
    static String average(String[] arrayNotSort) {
        String[] array = Task2.sort(arrayNotSort);
        if (array[0].length() < array[1].length()) {
            return ("Строки длина которых меньше средней " + array[0] + " длина " +
                    array[0].length());
        } else {
            return ("Строки, которая меньше средней, нет");
        }
    }
}
