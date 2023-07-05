package Lesson2;

import java.util.Scanner;

class Car {
    private String vin;
    private static int place;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    //Задаем номер машине
    public void take() {
        System.out.println("Введите номер авто");
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        setVin(n);
    }

    public static void setPlace(int place) {
        Car.place = place;
    }

    public static int getPlace() {
        return place;
    }

    //Занимаем парковочное место
    public void takePlace() {
        System.out.println("Выберите место");
        Scanner input = new Scanner(System.in);
        int f = input.nextInt();
        setPlace(f);
    }
}