package main.homework.lesson7;

public class App {
    public static void main(String[] args) throws Exception {

        Patient patient = new Patient(2);

        Therapist therapist = new Therapist(patient);
        therapist.treat();
    }
}