package Lesson4.Homework;

public class Ram {
    String name;
    int value;

    Ram() {
    }

    Ram(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void showInfo() {
        System.out.println("Name: " + name + "Value: " + value);
    }

}
