package Lesson2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int b = 0;
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a > 0) {
            for (int i = 0; i <= a; i++) {
                b = b + i;
            }
            System.out.println(b);
        } else {
            System.out.println("Число отрицательное");
        }
    }
}
