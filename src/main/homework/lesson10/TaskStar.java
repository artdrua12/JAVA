package main.homework.lesson10;

public class TaskStar {

    static String polindrom(String line, int num) {

        String[] words = line.split(" ");
        if (num > words.length) {
            return ("Введенное число больше чем количество слов в строке");
        } else {
            StringBuilder strb = new StringBuilder(words[num]);
            String reverse = strb.reverse().toString();
            if (reverse.equalsIgnoreCase(words[num])) {
                // System.out.println(words[num] + " Является полиндромом");
                return (words[num] + " Является полиндромом");
            } else {
                return (words[num] + "Не является полиндромом");
            }

        }
    }

}
