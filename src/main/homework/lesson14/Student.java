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

    public int average(int[] array) {

        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa += array[i];
        }
        return Math.round(summa / array.length);

    }

    public Boolean checkStudent() {
        int grade = this.average(this.grade);
        if (grade < 3) {
            return false;
        } else {
            return true;
        }
    }
}
