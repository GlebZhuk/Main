package Lesson4.Practic;

import java.util.Random;

public class Student {
    private String name;
    private String group;
    private int mark;

    Student(String name) {
        this.name = name;
        this.group = "Group1";
        Random rnd = new Random();
        this.mark = rnd.nextInt(10);
    }

    public void showInfo() {
        System.out.println(group + " Mark: " + mark + "  " + name);
    }

    public void bestStudents() {
        if (mark > 8) System.out.println(group + " Mark: " + mark + "  " + name);
    }
}
