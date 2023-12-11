package main.homework.lesson11;

import java.util.Scanner;

// Задача 1:
// Вывести в консоль из строки которую пользователь вводит с клавиатуры все
// аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
// только из прописных букв, без чисел.
// Задача *:
// Программа на вход получает произвольный текст. В этом тексте может быть номер
// документа(один или несколько), емейл и номер телефона. Номер документа в формате:
// xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
// может содержать не всю информацию, т.е. например, может не содержать номер
// телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
// формате:email: teachmeskills@gmail.com
// document number: 1423-1512-51
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите строку");
        String line = scaner.nextLine();
        System.out.println("Слова в строке " + Task.searchWords(line));

        System.out.println("Введите строку для задачи со звездочкой");
        String line2 = scaner.nextLine();
        // String line2 =
        // "fg+(375)5048175567dgf7777-5555-55hkgvh0000-4444-88hhh+(23)1234567csdc5555-5555-44
        // art@rambler.ru";
        System.out.println(TaskSuperStar.searchSuperStar(line2));

        scaner.close();

    }
}
