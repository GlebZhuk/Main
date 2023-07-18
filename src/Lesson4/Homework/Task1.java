package Lesson4.Homework;

public class Task1 {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(12345, 25);
        CreditCard card2 = new CreditCard(54321, 50);
        CreditCard card3 = new CreditCard(91911, 75);
        card1.giveMoney(25);
        card2.giveMoney(5);
        card3.takeMoney(15);
        card1.showInfo();
        card2.showInfo();
        card3.showInfo();
    }
}
