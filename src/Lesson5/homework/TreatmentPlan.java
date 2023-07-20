package Lesson5.homework;

public class TreatmentPlan {
    private int number;
    private TreatmentPlan treatmentPlan;

    public TreatmentPlan(int number) {
        this.number = number;
    }

    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }

    public static void choseTreat(TreatmentPlan treatmentPlan) {
        if (treatmentPlan.number == 1) {
            Surgeon surgeon = new Surgeon();
            surgeon.treat();
        } else if (treatmentPlan.number == 2) {
            Dentist dentist = new Dentist();
            dentist.treat();
        } else {
            Therapist therapist = new Therapist();
            therapist.treat();
        }
    }
}


