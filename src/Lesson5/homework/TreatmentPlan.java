package Lesson5.homework;

public class TreatmentPlan {
    private int number;

    public TreatmentPlan(int number) {
        this.number = number;
    }

    public int getPlan() {
        return number;
    }

    public void choseTreat(int number) {
        if (number == 1) {
            Surgeon surgeon = new Surgeon();
            surgeon.treat();
        } else if (number == 2) {
            Dentist dentist = new Dentist();
            dentist.treat();
        } else {
            Therapist therapist = new Therapist();
            therapist.treat();
        }
    }
}
