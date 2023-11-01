package main.homework.lesson10;

public class Task4 {
    public static String different(String[] array) {

        for (int i = 0; i < array.length; i++) {
            char[] charArray = array[i].toCharArray();
            String worter = "";

            for (int j = 0; j < charArray.length; j++) {
                if (array[i].indexOf(charArray[j], j + 1) > -1) {
                    break;
                }
                if (j == charArray.length - 1) {
                    worter = array[i];
                    break;
                }
            }

            if (!worter.equals("")) {
                return  worter ;
            }
        }
        return "Строки состоящей из различных символов нет";
    }

}
