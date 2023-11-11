package main.homework.controlWork1;

import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class Accounds {

    public static List<String> findAccountsFromList(List<String> list) {
        List<String> lines = new ArrayList<>();
        for (String el : list) {
            lines.addAll(Accounds.findAccounts(el));
        }
        return lines;
    }

    public static List<String> findAccounts(String line) {
        Pattern pattern = Pattern
                .compile(
                        "(\\d{5}-\\d{5})[\\s\\.]{0,3}[a-zA-Zа-яА-Я]{0,3}[\\s\\.]{0,3}(\\d{5}-{1}\\d{5})[\\s.]{0,3}(\\d{1,10})");
        Matcher matcher = pattern.matcher(line);
        List<String> words = new ArrayList<>();

        while (matcher.find()) {
            words.add(line.substring(matcher.start(), matcher.end()) + "\n");
        }
        return words;
    }

}
