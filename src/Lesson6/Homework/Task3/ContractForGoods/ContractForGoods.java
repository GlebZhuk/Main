package Lesson6.Homework.Task3.ContractForGoods;

import Lesson6.Homework.Task3.Document.Document;

import java.util.Date;


public class ContractForGoods extends Document {
    private String typeGoods;
    private int countGoods;

    public ContractForGoods() {
    }

    public ContractForGoods(int numberDoc, Date date, int countGoods, String typeGoods) {
        super(numberDoc, date);
        this.countGoods = countGoods;
        this.typeGoods = typeGoods;
    }

    @Override
    public String toString() {
        return "ContractForGoods{" +
                "typeGoods='" + typeGoods + '\'' +
                ", countGoods=" + countGoods + " Date" + getDate() + " NumberDoc:" + getNumberDoc() +
                '}';
    }
}
