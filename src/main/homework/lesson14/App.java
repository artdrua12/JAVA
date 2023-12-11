package main.homework.lesson14;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например:
        // "1, 2, 3,
        // 4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат
        // на экран.
        // При решении использовать коллекции
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите числа через пробел");
        String line = scaner.nextLine();
        System.out.println("Задание 1: " + line + " => " + Task1.single(line));
        scaner.close();

        // Задание2
        // Создать класс, который будет хранить в себе коллекцию с названиями животных.
        // Реализовать методы удаления и добавления животных по следующим правилам:
        // добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать
        // работу
        // объекта этого класса в main методе другого класса.
        Task2.add("Bear");
        Task2.add("Fox");
        Task2.add("Rabbit");
        System.out.println("Создали коллекцию со значениями " + Task2.show());
        Task2.remove();
        System.out.println("Коллекция после удаления " + Task2.show());

        // Задание3
        // Создать класс Student, содержащий следующие характеристики – имя, группа,
        // курс,
        // оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
        // Написать метод, который удаляет студентов со средним баллом <3. Если средний
        // балл>=3, студент переводится на следующий курс. Дополнительно написать метод
        // printStudents(List<Student> students, int course), который получает список
        // студентов и
        // номер курса. А также печатает на консоль имена тех студентов из списка,
        // которые
        // обучаются на данном курсе
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("Vasa", 1, 351002, new int[] { 3, 4, 5, 1 });
        Student student2 = new Student("Ola", 2, 740102, new int[] { 5, 2, 5, 4 });
        Student student3 = new Student("Sasa", 3, 351002, new int[] { 4, 4, 5, 1 });
        Student student4 = new Student("Ana", 2, 740102, new int[] { 3, 2, 2, 2 });
        Student student5 = new Student("Kola", 3, 351002, new int[] { 5, 5, 2, 4 });
        Student student6 = new Student("Ira", 1, 740102, new int[] { 2, 1, 3, 3 });
        Student student7 = new Student("Oleg", 1, 740102, new int[] { 3, 1, 3, 1 });

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);

        Addition.print(students);

        Addition.filter(students, 3);
        Addition.addCourse(students, 3);
        System.out.println("\n После фильтрации");

        Addition.print(students);

        System.out.println("\n 4 курсники");
        Addition.printStudents(students, 4);
    }

}
