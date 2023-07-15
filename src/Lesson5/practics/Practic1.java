package Lesson5.practics;

public class Practic1 {
    public static void main(String[] args) {
        Days monday = Days.MONDAY;
        Days tuesday = Days.TUESDAY;
        Days wednesday = Days.WEDNESDAY;
        Days thurthday = Days.THURSDAY;
        Days friday = Days.FRIDAY;
        Days saturday = Days.SATURDAY;
        Days sunday = Days.SUNDAY;
        System.out.print(monday.name());
        monday.weekend();
        System.out.print(tuesday.name());
        tuesday.weekend();
        System.out.print(wednesday.name());
        wednesday.weekend();
        System.out.print(thurthday.name());
        thurthday.weekend();
        System.out.print(friday.name());
        friday.weekend();
        System.out.print(saturday.name());
        saturday.weekend();
        System.out.print(sunday.name());
        sunday.weekend();

    }
}
