package Lesson5.practics;

public enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public void weekend() {
        if (this == SATURDAY || this == SUNDAY) System.out.println(" Weekend");
        else System.out.println(" Workday");
    }


}
