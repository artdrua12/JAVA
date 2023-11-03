package main.homework.lesson14;

import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите числа через пробел");
        String line = scaner.nextLine();
        System.out.println("Задание 1: " + line + " => " + Task1.single(line));
        scaner.close();

        // Задание2
        Task2.add("Bear");
        Task2.add("Fox");
        Task2.add("Rabbit");
        System.out.println(Task2.show());
        Task2.remove();
        System.out.println(Task2.show());

        // Задание3
        LinkedList<Student> students = new LinkedList<Student>();
        Student student1 = new Student("Vasa", 1, 351002, new int[] { 3, 4, 5, 1 });
        Student student2 = new Student("Ola", 2, 740102, new int[] { 1, 2, 5, 1 });
        Student student3 = new Student("Sasa", 3, 351002, new int[] { 4, 4, 5, 1 });
        Student student4 = new Student("Ana", 2, 740102, new int[] { 3, 2, 2, 2 });
        Student student5 = new Student("Kola", 3, 351002, new int[] { 3, 1, 2, 1 });
        Student student6 = new Student("Ira", 1, 740102, new int[] { 2, 1, 3, 1 });
        Student student7 = new Student("Oleg", 1, 740102, new int[] { 3, 4, 5, 1 });

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);

        System.out.println(students.toString());

        // for (Student std : students) {
        //     if (std.checkStudent()) {
        //         int curse = std.getCurse();
        //         std.setCurse(curse + 1);
        //     } else {
        //         students.remove(std);
        //     }
        // }
    }
}
