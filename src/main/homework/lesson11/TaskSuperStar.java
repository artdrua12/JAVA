package main.homework.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskSuperStar {

    public static String searchSuperStar(String line) {

        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> phone = new ArrayList<>();
        ArrayList<String> email = new ArrayList<String>();

        Pattern pattern2 = Pattern.compile("\\d{4}-\\d{4}-\\d{2}");
        Pattern pattern3 = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");
        Pattern pattern4 = Pattern.compile("\\w{1,}@\\w{1,}.\\w{1,}");
        Matcher matcher2 = pattern2.matcher(line);
        Matcher matcher3 = pattern3.matcher(line);
        Matcher matcher4 = pattern4.matcher(line);
        // System.out.println("Numbers");
        while (matcher2.find()) {
            // System.out.println(line.substring(matcher2.start(), matcher2.end()));
            numbers.add(line.substring(matcher2.start(), matcher2.end()));
        }
        // System.out.println("Phone");
        while (matcher3.find()) {
            // System.out.println(line.substring(matcher3.start(), matcher3.end()));
            phone.add(line.substring(matcher3.start(), matcher3.end()));
        }
        // System.out.println("Email");
        while (matcher4.find()) {
            // System.out.println(line.substring(matcher4.start(), matcher4.end()));
            email.add(line.substring(matcher4.start(), matcher4.end()));
        }

        return "numbers" + " = " + Arrays.toString(numbers.toArray())
                + " phone" + " = " + Arrays.toString(phone.toArray())
                + " email" + " = " + Arrays.toString(email.toArray());
    }
}
