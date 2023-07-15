package Lesson5.homework;

public class Task2 {
    public static void main(String[] args) {
        Patient patient = new Patient();
        TreatmentPlan plan = new TreatmentPlan(2);
        patient.setPlan(plan.getPlan());
        patient.getPlan();
        plan.choseTreat(patient.getPlan());
    }
}

