package Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 9, 5, 6, 7, 8, 9};
        int n = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            n = input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                count++;
            }
        }
        if (count >= 1) {
            int[] array2 = new int[array.length - count];
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != n) {
                    array2[j] = array[i];
                    j++;
                }
            }
            System.out.println(Arrays.toString(array2));
        } else {
            System.out.println("Array2 not exist");
        }
    }
}
