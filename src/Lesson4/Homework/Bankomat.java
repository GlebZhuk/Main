package Lesson4.Homework;

import java.sql.SQLOutput;

public class Bankomat {
    private int note20;
    private int note50;
    private int note100;

    Bankomat(int note20, int note50, int note100) {
        this.note20 = note20;
        this.note50 = note50;
        this.note100 = note100;
    }

    public void addMoney(int money) {
        if (money == 20) setNote20(note20 + 1);
        else if (money == 50) setNote50(note50 + 1);
        else if (money == 100) setNote100(note100 + 1);
        else System.out.println("Данные банкноты не принимаются");
    }

    @Override
    public String toString() {
        return "Bankomat{" +
                "note20=" + note20 +
                ", note50=" + note50 +
                ", note100=" + note100 +
                '}';
    }

    public int getNote20() {
        return note20;
    }

    public int getNote50() {
        return note50;
    }

    public int getNote100() {
        return note100;
    }

    public void setNote20(int note20) {
        this.note20 = note20;
    }

    public void setNote50(int note50) {
        this.note50 = note50;
    }

    public void setNote100(int note100) {
        this.note100 = note100;
    }

    boolean takeMoney(int money) {
        if (money == 20 && money < note20 * 20) {
            setNote20(note20 - 1);
            return true;
        } else if (money == 50 && money < note50 * 50) {
            setNote50(note50 - 1);
            return true;
        } else if (money == 100 && money < note100 * 100) {
            setNote100(note100 - 1);
            return true;
        } else return false;
    }
}
