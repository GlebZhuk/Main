package Lesson2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {


        int z = 0;//счетчик созданых авто на парковке
        boolean run = true;
        Scanner input = new Scanner(System.in);
//Создаем парковку и парковочные места со статусом свободно
        Parking parking = new Parking();
        int[] array = new int[parking.getSize()];//массив занятых парковочных мест
        Parking[] lot = new Parking[parking.getSize()];
        System.out.println("Парковка на " + parking.getSize() + " парковочных мест");
        for (int j = 0; j < parking.getSize(); j++) {
            lot[j] = new Parking();
            lot[j].setStatus("Свободно");
            lot[j].setNumber(j + 1);
        }

// Создаем массив автомобилей с нулевым статусом
        Car[] car = new Car[parking.getSize()];
        for (int j = 0; j < parking.getSize(); j++) {
            car[j] = new Car();
            car[j].setVin("000");
        }
//МЕНЮ
        while (run) {
            System.out.println("Выберете действие:\n1.Показать свободные места.\n2.Припарковать машину.\n3.Уехать\n4.Выход");
            String n = input.nextLine();
//Выводим список мест
            switch (n) {
                case "1":
                    for (int j = 0; j < parking.getSize(); j++) {
                        System.out.println("Парковочное место №" + lot[j].getNumber() + " сейчас - " + lot[j].getStatus());
                    }
                    break;
//Паркуем машину
                case "2":
                    car[z].take();
                    car[z].takePlace();
                    if (lot[car[z].getPlace() - 1].getStatus().equals("Свободно")) {
                        lot[car[z].getPlace() - 1].setStatus("Занято автомобилем с номером: " + car[z].getVin());
                        array[z] = car[z].getPlace() - 1;
                        z++;
                        break;
                    } else {
                        System.out.println("Место занято, выберите другое место");
                    }
                    break;
//Машина уезжает
                case "3":
                    System.out.println("Введите номер уезжающего авто");
                    String s = input.nextLine();

                    for (int j = 0; j < parking.getSize() - 1; j++) {
                        if (s.equals(car[j].getVin())) {
                            lot[array[j]].setStatus("Свободно");
                        }
                    }
                    break;
//Выход с меню
                case "4":
                    run = false;
                    break;
                default:
                    System.out.println("Некорректный ввод");
                    break;
            }
        }
    }
}
