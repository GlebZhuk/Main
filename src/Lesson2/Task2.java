package Lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        if (b == 1) {
            System.out.println("Janvary");
        } else if (b == 2) {
            System.out.println("Febrary");
        } else if (b == 3) {
            System.out.println("Mart");
        } else if (b == 4) {
            System.out.println("April");
        } else if (b == 5) {
            System.out.println("May");
        } else if (b == 6) {
            System.out.println("June");
        } else if (b == 7) {
            System.out.println("July");
        } else if (b == 8) {
            System.out.println("August");
        } else if (b == 9) {
            System.out.println("September");
        } else if (b == 10) {
            System.out.println("October");
        } else if (b == 11) {
            System.out.println("November");
        } else {
            System.out.println("December");
        }

    }
}
