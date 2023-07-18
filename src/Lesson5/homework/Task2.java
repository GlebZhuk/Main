package Lesson5.homework;

public class Task2 {
    public static void main(String[] args) {
        Patient patient = new Patient();
        TreatmentPlan treatmentPlan = new TreatmentPlan(2);
        patient.setPlan(treatmentPlan);
        treatmentPlan.choseTreat(treatmentPlan.getPlan());
    }


}

