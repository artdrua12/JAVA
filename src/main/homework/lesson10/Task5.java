package main.homework.lesson10;

public class Task5 {
    static StringBuffer[] two(String[] array) {
        StringBuffer[] arrayBufer = new StringBuffer[3];
        for (int i = 0; i < array.length; i++) {
            char[] charArray = array[i].toCharArray();
            arrayBufer[i] = new StringBuffer(array[i]);
            for (int j = 0; j < charArray.length; j++) {
                arrayBufer[i].insert(j * 2, charArray[j]);
            }
            // System.out.println(array[i] + " => " + arrayBufer[i].toString() + "\n");
        }
        return arrayBufer;
    }
}
