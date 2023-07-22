package Lesson6.Homework.Task3.BillOfLading;

import Lesson6.Homework.Task3.Document.Document;

import java.util.Date;


public class BillOfLading extends Document {
    private int sum;
    private int code;

    public BillOfLading() {
    }

    public BillOfLading(int numberDoc, Date date, int sum, int code) {
        super(numberDoc, date);
        this.sum = sum;
        this.code = code;
    }

    @Override
    public String toString() {
        return "BillOfLading{" +
                "sum=" + sum +
                ", code=" + code + getDate() + " NumberDoc:" + getNumberDoc() +
                '}';
    }
}
