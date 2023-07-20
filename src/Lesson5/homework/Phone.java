package Lesson5.homework;

public class Phone {
    private int number;
    private String model;
    private double weight;

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        new Phone(number, model);

    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + " Number: " + number);
    }

    public void sendMeassage(int... number) {
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }

    public int getNumber() {
        return number;
    }
}