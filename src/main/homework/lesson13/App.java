package main.homework.lesson13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class App {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("Java/src/main/homework/lesson13/fileStart.txt"))) {
            String line = reader.readLine();
            String maxWord = "";

            while (line != null) {
                String longWord = Find.findLongWord(line, maxWord);
                if (longWord.length() > maxWord.length()) {
                    maxWord = longWord;
                }
                line = reader.readLine();
            }

            System.out.println("Максимальное длинное слово = " + maxWord);

            try (BufferedWriter writter = new BufferedWriter(
                    new FileWriter("Java/src/main/homework/lesson13/fileEnd.txt"))) {

                writter.write(maxWord + "\n");

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
