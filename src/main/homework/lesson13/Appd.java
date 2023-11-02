package main.homework.lesson13;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appd {

    public static void main(String[] args) {
        // try (BufferedReader reader = new BufferedReader(
        // new FileReader("Java/src/main/homework/lesson13/fileOut.txt"))) {
        // String line = reader.readLine();
        // String line2 = "gfhjsdf dshgfa ah dg";
        // String maxLengthWord = "";

        // while (line != null) {
        // line = reader.readLine();
        // String currentWord = findLongWord(line2, maxLengthWord);
        // if (currentWord.length() < maxLengthWord.length()) {
        // maxLengthWord = currentWord;
        // }
        // }

        // System.out.println("Максимальное слово " + maxLengthWord);

        // } catch (IOException e) {
        // e.printStackTrace();
        // }
        String line2 = "gfhjsdf  dshgfa  ah dg";
        String maxLengthWord = "fdf";

        String currentWord = findLongWord(line2, maxLengthWord);
        if (currentWord.length() < maxLengthWord.length()) {
            maxLengthWord = currentWord;
        }

        System.out.println("Максимальное слово " + maxLengthWord);

    }

    public static String findLongWord(String line, String maxLengthWord) {
        Pattern pattern = Pattern.compile("[а-яА-Яa-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(line);

        ArrayList<String> words = new ArrayList<>();
        String maxWord = maxLengthWord;

        while (matcher.find()) {
            words.add(line.substring(matcher.start(), matcher.end()));
            String word = maxWord(words.toArray());
            if (maxWord.length() < word.length()) {
                maxWord = word;
            }
            words.clear();
        }

        return maxWord;
    }

    public static String maxWord(String[] array) {

        int max = array[0].length();
        String strMax = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > max) {
                max = array[i].length();
                strMax = array[i];
            }
        }
        return strMax;
    }
}
