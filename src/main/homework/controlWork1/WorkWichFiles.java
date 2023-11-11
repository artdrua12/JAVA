package main.homework.controlWork1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkWichFiles {

    static public void findFiles(String patch) {
        File folder = new File(patch);
        List<String> acountList = new ArrayList<>();
        // поиск и чтение файлов
        System.out.println("Были прочитаны файлы");
        for (File file : folder.listFiles()) {
            System.out.println(file.getName());
            Path p = file.toPath();
            List<String> list = WorkWichFiles.readFile(p);
            acountList.addAll(Accounds.findAccountsFromList(list));
        }
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
            FileOutputStream outputStream = new FileOutputStream(outputFile);
            for (String el : list) {
                byte[] strToBytes = el.getBytes();
                outputStream.write(strToBytes);
            }
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.err.println("FileStreamsTest: " + e);
        } catch (IOException e) {
            System.err.println("FileStreamsTest: " + e);
        }
    }
}
