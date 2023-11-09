package main.homework.lesson15;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Addition {

    public static String plus100(String line) {
        Pattern pattern = Pattern
                .compile("(0[1-9]|[12][0-9]|3[01])[\\s.,-/]{0,}(0[1-9]|1[12])[\\s.,-/]{0,}([1,2][0-9]{3})");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            LocalDate localDate = LocalDate.parse(matcher.group(3) + "-" + matcher.group(2) + "-" + matcher.group(1));
            LocalDate localDateNew = localDate.plusYears(100);
            return localDateNew.toString();
        } else {
            return "Неверный ввод даты";
        }
    }

    public static String positive(int[] array) {
        StringBuilder sBuilder = new StringBuilder();
        Arrays.stream(array).filter(el -> el > 0).forEach(el -> sBuilder.insert(0, el));
        return sBuilder.reverse().toString();
    }

    public static Function<String, String> convertWitchFunction() {

        Function<String, String> convert = str -> {
            String[] array = str.split(" ");
            int summa = Integer.parseInt(array[0]);
            return Math.round(summa / 3) + " USD";
        };

        return convert;
    }

    public static Consumer<String> convertWitchConsumer() {

        Consumer<String> convert = str -> {
            String[] array = str.split(" ");
            int summa = Integer.parseInt(array[0]);
            System.out.println(Math.round(summa / 3) + " USD");
        };

        return convert;
    }

    public static Supplier<String> upheaval() {

        Supplier<String> up = () -> {
            Scanner scaner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String line = scaner.nextLine();
            scaner.close();
            StringBuffer arrayBufer = new StringBuffer(line);
            return arrayBufer.reverse().toString();
        };

        return up;
    }


    // @FunctionalInterface
    // public interface  BiMaper <T ,B, R> {
    //     R map (T first,B second);
        
    // }
    

}
