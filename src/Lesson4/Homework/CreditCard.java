package Lesson4.Homework;

public class CreditCard {
    int number;
    int amountMoney;

    CreditCard(int number, int amountMoney) {
        this.number = number;
        this.amountMoney = amountMoney;
    }

    public void giveMoney(int money) {
        amountMoney += money;
    }

    public void takeMoney(int money) {
        amountMoney -= money;
    }

    public void showInfo() {
        System.out.println("Card number: " + number + "\nAmount money: " + amountMoney + "$");
    }
}
