package Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Practic2 {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("Set array length");
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            n = input.nextInt();
        } else {
            System.out.println("Input not correct");
        }
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
