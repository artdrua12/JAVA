package main.homework.lesson7;

import java.util.Random;

public class Therapist extends Doctor {

    private Patient patient;

    public Therapist(Patient patient) {
        this.patient = patient;
    }

    public void prescription(){
       System.out.println("Терапевт назначает врача ");
       patient.setTreatmentPlan(random());
    }

    private int random() {
        int min = 1;
        int max = 2;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        return i += min;
    }

    public void treat() {
        System.out.println("Терапевт начинает лечить ");
        int plan = 0;
        try {
            plan = patient.getTreatmentPlan();
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
