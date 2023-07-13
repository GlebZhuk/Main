package Lesson4.Homework;

public class Hdd {
    String name;
    int value;
    String type;

    Hdd() {
    }

    Hdd(String name, int value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public void showInfo() {
        System.out.println("Name: " + name + "Value: " + value + "Tupe: " + type);
    }

}
