package main.homework.lesson7;

public class App {
    public static void main(String[] args) throws Exception {

        Patient patient = new Patient();

        Therapist therapist = new Therapist(patient);
        therapist.prescription();
        therapist.treat();
    }
}