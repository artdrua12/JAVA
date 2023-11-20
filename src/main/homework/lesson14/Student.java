package main.homework.lesson14;

public class Student {
    private String name;
    private int curse;
    private int grupa;
    private int[] grade;

    public Student(String name, int curse, int grupa, int[] grade) {
        this.name = name;
        this.curse = curse;
        this.grupa = grupa;
        this.grade = grade;
    }

    public int[] getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public int getCurse() {
        return curse;
    }

    public int getGrupa() {
        return grupa;
    }

    public void setCurse(int curse) {
        this.curse = curse;
    }

    public int average() {

        int summa = 0;
        for (int i = 0; i < this.grade.length; i++) {
            summa += this.grade[i];
        }
        return Math.round(summa / this.grade.length);

    }

    public Boolean isStudent(int num) {
        int averageGrade = this.average();
        if (averageGrade < num) {
            return false;
        } else {
            return true;
        }
    }
}
