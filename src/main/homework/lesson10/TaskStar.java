package main.homework.lesson10;

public class TaskStar {

    public static String polindrom(String line, int num) {

        String[] words = line.split(" ");
        if (num > words.length) {
            return ("Введенное число больше чем количество слов в строке");
        } else {
            StringBuilder strb = new StringBuilder(words[num]);
            String reverse = strb.reverse().toString();
            if (reverse.equalsIgnoreCase(words[num])) {
                // System.out.println(words[num] + " Является полиндромом");
                return words[num].toString() + " полиндром";
            } else {
                return words[num].toString() + " не является полиндромом";
            }

        }
    }

}
