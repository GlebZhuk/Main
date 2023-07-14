package Lesson4.Homework;

public class Ram {
    String name;
    int value;

    public Ram() {
    }

    public Ram(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public void showInfo() {
        System.out.println(this.toString());
    }

}
