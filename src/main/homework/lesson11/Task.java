package main.homework.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task {
    public static String searchWords(String line) {
        Pattern pattern = Pattern.compile("[a-zA-Z]{2,6}");
        Matcher matcher = pattern.matcher(line);
        ArrayList<String> words = new ArrayList<String>();
        while (matcher.find()) {
            words.add(line.substring(matcher.start(), matcher.end()));
            // System.out.println(line.substring(matcher.start(), matcher.end()));
        }
        return Arrays.toString(words.toArray());
    }
}
