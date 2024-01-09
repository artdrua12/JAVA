package main.homework.lesson14;

import java.util.List;

public class Addition {

    public static List<Student> filter(List<Student> students, int num) {
        students.removeIf(el -> el.isStudent(num) == false);
        return students;
    }

    public static List<Student> addCourse(List<Student> students, int num) {

        for (int i = 0; i < students.size(); i++) {
            Student curStudent = students.get(i);
            if (curStudent.isStudent(num)) {
                int curse = curStudent.getCurse();
                curStudent.setCurse(curse + 1);
            }
        }
        return students;
    }

    public static void printStudents(List<Student> students, int course) {
        for (int i = 0; i < students.size(); i++) {
            Student curStudent = students.get(i);
            int curse = curStudent.getCurse();
            if (curse == course) {
                System.out.println(curStudent.getName() + " обучается на " + course + "курсе");
            }
        }
    }

    public static void print(List<Student> students) {
        for (Student std : students) {
            System.out.println(
                    std.getName() + " Coourse " + std.getCurse() + " Average = " + std.average() + " ");
        }
    }
}
