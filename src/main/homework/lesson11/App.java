package main.homework.lesson11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите строку");
        String line = scaner.nextLine();

        Pattern pattern = Pattern.compile("[a-zA-Z]{2,6}");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            System.out.println(line.substring(matcher.start(), matcher.end()));
        }

        System.out.println("Введите строку для задачи со звездочкой");
        String line2 = scaner.nextLine();
        // String line2 =
        // "fg+(375)5048175567dgf7777-5555-55hkgvh0000-4444-88hhh+(23)1234567csdc5555-5555-44
        // art@rambler.ru";
        Pattern pattern2 = Pattern.compile("\\d{4}-\\d{4}-\\d{2}");
        Pattern pattern3 = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");
        Pattern pattern4 = Pattern.compile("\\w{1,}@\\w{1,}.\\w{1,}");
        Matcher matcher2 = pattern2.matcher(line2);
        Matcher matcher3 = pattern3.matcher(line2);
        Matcher matcher4 = pattern4.matcher(line2);
        System.out.println("Numbers");
        while (matcher2.find()) {
            System.out.println(line2.substring(matcher2.start(), matcher2.end()));
        }
        System.out.println("Phone");
        while (matcher3.find()) {
            System.out.println(line2.substring(matcher3.start(), matcher3.end()));
        }
        System.out.println("Email");
        while (matcher4.find()) {
            System.out.println(line2.substring(matcher4.start(), matcher4.end()));
        }

    }
}
