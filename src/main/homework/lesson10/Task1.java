package main.homework.lesson10;

public class Task1 {

    public static String longLine(String[] array) {

        String strMax = array[0];
        int max = array[0].length();
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > max) {
                max = array[i].length();
                strMax = array[i];
            }
        }
        System.out.println("Самая длинная строка " + strMax + " длина " + max);
        return strMax;
    }

    public static String shortLine(String[] array) {

        String strMin = array[0];
        int min = array[0].length();
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() < min) {
                min = array[i].length();
                strMin = array[i];
            }
        }
        System.out.println("Самая короткая строка " + strMin + " длина " + min);
        return strMin;

    }
}
