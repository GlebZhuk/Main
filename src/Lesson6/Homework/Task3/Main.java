package Lesson6.Homework.Task3;

import Lesson6.Homework.Task3.BillOfLading.BillOfLading;
import Lesson6.Homework.Task3.ContractForGoods.ContractForGoods;
import Lesson6.Homework.Task3.ContractWthEmployee.ContractWithEmployee;
import Lesson6.Homework.Task3.Document.Document;
import Lesson6.Homework.Task3.Registr.Registr;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Document doc1 = new ContractForGoods(1, new Date(), 5, "goods");
        Document doc2 = new ContractWithEmployee(2, new Date(), "Worker1", new Date(124, 7, 31));
        Document doc3 = new BillOfLading(3, new Date(), 100, 12351243);
        Registr.saveDoc(doc1);
        Registr.saveDoc(doc2);
        Registr.saveDoc(doc3);
        Registr.showInfo();
    }
}
