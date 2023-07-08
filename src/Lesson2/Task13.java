package Lesson2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        float a;
        int b;
        float c;
        System.out.println("Введите сумму кредита:");
        Scanner input = new Scanner(System.in);
        a = input.nextFloat();
        System.out.println("Введите количество месяцев платежа:");
        Scanner input2 = new Scanner(System.in);
        b = input2.nextInt();
        for (int i = 1; i <= b; i++) {
            c = a * 7 / 100;
            a += c;
        }
        System.out.println("Конечный платеж составляет:");
        System.out.println(a);
    }
}
