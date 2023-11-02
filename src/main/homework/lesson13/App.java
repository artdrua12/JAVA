package main.homework.lesson13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("Java/src/main/homework/lesson13/fileOut.txt"))) {
            String line = reader.readLine();
            // String line2 = "gfhjsdf dshgfa ah dg";
            String maxWord = "";

            while (line != null) {
                line = reader.readLine();
                String currentWord = findLongWord(line, maxWord);
                if (currentWord.length() > maxWord.length()) {
                    maxWord = currentWord;
                }
            }

            System.out.println("Максимальное слово " + maxWord);

        } catch (IOException e) {
            e.printStackTrace();
        }
        // String line2 = "gfhjsdf dshgfa ah dg abcdefghijkl";
        // String maxLengthWord = "fdf";

        // String currentWord = findLongWord(line2, maxLengthWord);
        // if (currentWord.length() > maxLengthWord.length()) {
        // maxLengthWord = currentWord;
        // }

        // System.out.println("Максимальное слово " + maxLengthWord);

    }

    public static String findLongWord(String line, String maxWord) {
        int lengthMaxWord = maxWord.length() + 1;
        Pattern pattern = Pattern.compile("[а-яА-Яa-zA-Z]{" + lengthMaxWord + ",}");
        Matcher matcher = pattern.matcher(line);

        String maxLength = "";

        while (matcher.find()) {
            String word = line.substring(matcher.start(), matcher.end());
            System.out.println("word.length() " + word.length());
            // if (word.length() > maxLength.length()) {
            //     maxLength = word;
            // }
        }
        System.out.println("maxWord " + maxLength);
        return maxLength;
    }

}
