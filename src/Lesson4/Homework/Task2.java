package Lesson4.Homework;

public class Task2 {
    public static void main(String[] args) {
        Comp comp1 = new Comp(123, "ws23");
        comp1.showInfo();
        Ram ram = new Ram("Kingston", 128);
        Hdd hdd = new Hdd("Kingston", 500, "internal");
        Comp comp2 = new Comp(256, "Vinux2000", ram, hdd);

        comp2.showInfo();
    }
}
