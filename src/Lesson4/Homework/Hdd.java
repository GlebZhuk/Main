package Lesson4.Homework;

public class Hdd {
    String name;
    int value;
    String type;

    public Hdd() {
    }

    public Hdd(String name, int value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", type='" + type + '\'' +
                '}';
    }

    public void showInfo() {
        System.out.println(this.toString());
    }

}
