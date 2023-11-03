package main.homework.lesson10;

import java.util.Arrays;

public class Task5 {
    public static String two(String[] array) {
        String[] arrayReturn = new String[3];
        StringBuffer[] arrayBufer = new StringBuffer[3];
        for (int i = 0; i < array.length; i++) {
            char[] charArray = array[i].toCharArray();
            arrayBufer[i] = new StringBuffer(array[i]);
            for (int j = 0; j < charArray.length; j++) {
                arrayBufer[i].insert(j * 2, charArray[j]);
            }
            arrayReturn[i] = arrayBufer[i].toString();
            // System.out.println(array[i] + " => " + arrayBufer[i].toString() + "\n");
        }
        return Arrays.toString(arrayReturn);
    }
}
