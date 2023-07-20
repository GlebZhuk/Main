package Lesson5.homework;

public class Task1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone(452, "Siemens", 45.5);
        Phone phone2 = new Phone(567, "Apple", 46.77);
        Phone phone3 = new Phone(989, "Samsung", 92.9);
        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());
        phone1.receiveCall("Dima");
        phone2.receiveCall("Misha");
        phone3.receiveCall("Maksim");
        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();
        phone1.receiveCall("Vlad", 891);
        phone2.sendMeassage(125, 456, 457567);
    }
}
