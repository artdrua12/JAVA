package main.homework.lesson7;

public class Patient {

    private String doctor;
    private int treatment_plan;

    public Patient(int treatment_plan) {
        this.treatment_plan = treatment_plan;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public int getTreatment_plan() {
        return treatment_plan;
    }

    public void setTreatment_plan(int treatment_plan) {
        this.treatment_plan = treatment_plan;
    }
}
