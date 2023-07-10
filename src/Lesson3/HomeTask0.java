package Lesson3;

import java.util.Scanner;

public class HomeTask0 {
    public static void main(String[] args) {

        int n = 0;

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            n = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                System.out.println("Array has number " + n);
                break;
            } else {
                System.out.println("Array has not number " + n);
                break;
            }
        }
    }
}