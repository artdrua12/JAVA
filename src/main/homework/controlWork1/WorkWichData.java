package main.homework.controlWork1;
import java.time.LocalDate;

public class WorkWichData {
    public static String curentDate() {
        LocalDate localDate = LocalDate.now();
        return localDate.toString();
    }
}
