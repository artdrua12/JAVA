package main.homework.controlWork1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkWichFiles {

    static public List<String> findFiles(String patch) {
        File folder = new File(patch);
        List<String> acountList = new ArrayList<>();
        // поиск и чтение файлов
        System.out.println("Были прочитаны файлы");

        for (File file : folder.listFiles()) {

            if (!isTxtFile(file))
                continue; // Если файл имеет расширение не .txt то пропускаем его
            System.out.println(file.getName());

            Path p = file.toPath();
            List<String> list = WorkWichFiles.readFile(p);
            acountList.addAll(Accounds.findAccountsFromList(list));
        }
        return acountList;
    }

    public static List<String> readFile(Path path) {
        List<String> lines = new ArrayList<>();
        try (Stream<String> lineStream = Files.lines(path)) {
            lines = lineStream.collect(Collectors.toList());
        } catch (IOException ignored) {
            System.err.println("Не удалось прочитать файл");
        }
        return lines;
    }

    public static void writeFile(List<String> list) {
        try {
            File outputFile = new File("Java/src/main/homework/controlWork1/archive/outFile.txt");
            FileOutputStream outputStream = new FileOutputStream(outputFile, false);
            for (String el : list) {
                byte[] strToBytes = el.getBytes();
                outputStream.write(strToBytes);
            }
            outputStream.close();
            System.out.println("Итоговый файл создан и распологается в achive / outFile.txt");
        } catch (FileNotFoundException e) {
            System.err.println("FileStreamsTest: " + e);
        } catch (IOException e) {
            System.err.println("FileStreamsTest: " + e);
        }
    }

    public static Boolean isTxtFile(File file) {
        String fileName = file.getName();
        String regex = "^[A-Za-zа-яА-Я]{1,}\\.txt$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fileName);
        return matcher.matches();
    }
}
