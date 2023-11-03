package main.homework.lesson14;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static String single(String line) {
        Pattern pattern = Pattern.compile("\\d{1,}");
        Matcher matcher = pattern.matcher(line);
        ArrayList<String> list = new ArrayList<>();

        while (matcher.find()) {

            String num = line.substring(matcher.start(), matcher.end());
            
            if (!list.contains(num)) {
                list.add(num);
            }

        }
        return list.toString();

    }
}
