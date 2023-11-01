package main.homework.lesson10;

public class Task3 {
    public static String average(String[] arrayNotSort) {
        String[] array = Task2.sort(arrayNotSort);
        if (array[0].length() < array[1].length()) {
            System.out.println("Строки длина которых меньше средней " + array[0] + " длина " +
                    array[0].length());
            return array[0];
        } else {
            System.out.println("Строки, которая меньше средней, нет");
            return "";
        }
    }
}
