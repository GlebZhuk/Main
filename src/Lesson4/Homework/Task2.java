package Lesson4.Homework;

public class Task2 {
    public static void main(String[] args) {
        Comp comp1 = new Comp(123, "w123");
        comp1.showInfo(new Ram(),new Hdd());
        Comp comp2 = new Comp(256, "Vinux2000", new Ram("Ram25", 50), new Hdd("Hdd33", 560, "outside"));

       comp2.showInfo(new Ram("Name542", 9990), new Hdd("1231", 123, "inside"));
    }
}
