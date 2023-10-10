package main.homework.lesson7;

public class Therapist extends Doctor {

    private Patient patient;

    public Therapist(Patient patient) {
        this.patient = patient;
    }

    public void treat() {
        System.out.println("Терапевт начинает лечить ");
        int plan = 0;
        try {
            plan = patient.getTreatment_plan();
        } catch (Exception e) {
            System.out.println(" У пациента нет валидного плана лечения");
        }
        if (plan == 1) {
            patient.setDoctor("Хирург");
            Surgeon surgeon = new Surgeon();
            surgeon.treat();
            System.out.println("Терапевт закончил лечить, пачиент лечился у " + patient.getDoctor());
        } else if (plan == 2) {
            patient.setDoctor("Дантист");
            Dantist dantist = new Dantist();
            dantist.treat();
            System.out.println("Терапевт закончил лечить, пачиент лечился у " + patient.getDoctor());
        } else {
            System.out.println("Терапевт закончил лечить, пачиент не лечился по причине неизвестного кода ");
        }

    }
}
