package main.homework.lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Find {
    public static String findLongWord(String line, String maxWord) {
        Pattern pattern = Pattern.compile("[а-яА-Яa-zA-Z]{" + (maxWord.length() + 1) + ",}");
        Matcher matcher = pattern.matcher(line);
        String longWord = maxWord;

        while (matcher.find()) {
            String word = line.substring(matcher.start(), matcher.end());
            System.out.println("word " + word);
            if (word.length() > longWord.length()) {
                longWord = word;
            }
        }
        return longWord;
    }

}
