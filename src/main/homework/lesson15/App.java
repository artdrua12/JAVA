package main.homework.lesson15;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {

        // Задание1
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите дату рождения в числовом формате день месяц год(4цифры)");
        String line = scaner.nextLine();
        System.out.println("Задание1 = Через 100 лет после вашего рождения будет " +
                Addition.plus100(line));

        // // Задание2
        int[] array = { 1, 2, 3, -2, -3 };
        System.out.print("Задание2 = " + Addition.positive(array));

        // Задание3
        Function<String, String> f = Addition.convertWitchFunction();
        System.out.println("\nЗадание3 = " + f.apply("300 BYN"));

        // Задание4
        Consumer<String> c = Addition.convertWitchConsumer();
        System.out.print("Задание4 = ");
        c.accept("400 BYN");

        // Задание5
        Supplier<String> s = Addition.upheaval();
        System.out.println("Задание5 = " + s.get());

        // Addition.BiMaper<Integer ,Integer ,String> test = (first,second) ->{
        //    return first+second + " _ ";
        // };
        
        // System.out.println(test.map(2,4));
    }
}
