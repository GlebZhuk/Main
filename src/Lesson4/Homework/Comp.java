package Lesson4.Homework;

public class Comp {
    int cost;
    String model;
    Ram ram;
    Hdd hdd;

    Comp(int cost, String mode) {
        this.cost = cost;
        this.model = model;
        this.ram = new Ram();
        this.hdd = new Hdd();
    }

    public Comp(int cost, String model, Ram ram, Hdd hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Comp{" +
                "cost=" + cost +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }

    public void showInfo() {
        System.out.println(this.toString());
    }
}
