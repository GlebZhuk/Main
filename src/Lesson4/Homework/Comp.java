package Lesson4.Homework;

public class Comp {
    int cost;
    String model;
    Ram ram;
    Ram hdd;

    Comp(int cost, String mode) {
        this.cost = cost;
        this.model = model;
        Ram ram = new Ram();
        Hdd hdd = new Hdd();
    }

    Comp(int cost, String model, Ram ram, Hdd hdd) {
        this.cost = cost;
        this.model = model;
    }

    public void showInfo(Ram ram, Hdd hdd) {
        System.out.println("Cost:" + cost + " Model:" + model + " Ram:" + ram.name + " " + ram.value + " HDD:" + hdd.name + " " + hdd.type + " " + hdd.value);
    }
}
