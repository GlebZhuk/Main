package Lesson2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if (t <= -5 && t > -20) {
            System.out.println("Нормально");
        } else if (-20 >= t) {
            System.out.println("Холодно");
        }
    }
}
