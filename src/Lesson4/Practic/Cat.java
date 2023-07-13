package Lesson4.Practic;

public class Cat {
    private String name;
    private int age;

    private int needFood;

    Cat(String name, int age, int needFood) {
        this.name = name;
        this.age = age;
        this.needFood = needFood;
    }

    public boolean feed(int giveFood) {
        return needFood <= giveFood;
    }
}
