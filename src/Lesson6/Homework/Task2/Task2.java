package Lesson6.Homework.Task2;

public class Task2 {
    public static void main(String[] args) {
        Employee director = new Director();
        Employee worker = new Worker();
        Employee accountatnt = new Accountant();
        director.Post();
        worker.Post();
        accountatnt.Post();
    }
}
