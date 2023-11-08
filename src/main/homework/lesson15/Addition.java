package main.homework.lesson15;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
}
