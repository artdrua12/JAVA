package main.homework.controlWork1;

import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class Account {

    public static List<String> findAccountsFromList(List<String> list) {
        List<String> lines = new ArrayList<>();
        for (String el : list) {
            lines.addAll(Account.findAccounts(el));
        }
        return lines;
    }

    public static List<String> findAccounts(String line) {
        Pattern pattern = Pattern
                .compile(
                        "(\\d{5}-\\d{5})[\\s\\.]{0,3}[\\sa-zA-Zа-яА-Я]{0,15}[\\s\\.]{0,3}(\\d{5}-{1}\\d{5})[\\sa-zA-Zа-яА-Я]{0,15}{0,15}(\\d{1,10}[.,]{0,1}\\d{0,10})");
        Matcher matcher = pattern.matcher(line);
        List<String> words = new ArrayList<>();

        while (matcher.find()) {
            words.add("Date of processing " + DateUtil.curentDate() + " from " + matcher.group(1) + " to "
                    + matcher.group(2) + " amount " + matcher.group(3) + "$\n");
        }
        return words;
    }

}
