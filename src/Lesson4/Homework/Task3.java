package Lesson4.Homework;

public class Task3 {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(4, 5, 2);

        bankomat.addMoney(100);

        if (bankomat.takeMoney(50)) System.out.println("Completed");
        else System.out.println("false");
        System.out.println(bankomat.toString());

    }
}
