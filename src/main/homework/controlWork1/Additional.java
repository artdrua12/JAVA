package main.homework.controlWork1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.util.regex.Matcher;

public class Additional {
    public static void readFile(Path path) {
        List<String> lines = new ArrayList<>();

        try (Stream<String> lineStream = Files.lines(path)) {

            lines = lineStream.collect(Collectors.toList());

        } catch (IOException ignored) {
            System.err.println("Не удалось прочитать файл");
        }

        System.out.println(lines);
    }

    public static String findLongWord(String line) {
        Pattern pattern = Pattern
                .compile("(\\d{5}-\\d{5})[\\s.]{0,3}(\\d{5}-\\d{5})[\\s.]{0,3}(\\d{1,10})");
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            String word = line.substring(matcher.start(), matcher.end());
            System.out.println("word " + word);
        }
        return "asd";
    }

}
