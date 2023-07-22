package Lesson6.Homework.Task3.ContractWthEmployee;

import Lesson6.Homework.Task3.Document.Document;

import java.util.Date;


public class ContractWithEmployee extends Document {
    private String name;
    private Date dateEndContract;
    public ContractWithEmployee(){}
    public ContractWithEmployee(int numberDoc,Date date,String name, Date dateEndContract){
        super(numberDoc,date);
        this.name=name;
        this.dateEndContract=dateEndContract;
    }

    @Override
    public String toString() {
        return "ContractWithEmployee{" +
                "name='" + name + '\'' +
                ", dateEndContract=" + dateEndContract +" Date" + getDate() + " NumberDoc:" + getNumberDoc() +
                '}';
    }
}
