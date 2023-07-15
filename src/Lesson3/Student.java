package Lesson3;

public class Student {
    private String name;
    private int group;
    private int mark;

    public Student(String name, int group, int mark) {
        this.name = name;
        this.group = group;
        this.mark = mark;
    }
    public String getName() {
        return name;
    }
    public int getGroup() {
        return group;
    }
    public int getMark() {
        return mark;
    }
}
