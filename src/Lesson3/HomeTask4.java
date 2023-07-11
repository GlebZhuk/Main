package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeTask4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        int count = 0;
        boolean run = true;
        Random rnd = new Random();

        while (run) {
            int[] array;
            if (input.hasNextInt()) {
                n = input.nextInt();
            }

            if (n > 5 && n <= 10) {
                run = false;
                array = new int[n];
                for (int i = 0; i < array.length; i++) {
                    array[i] = rnd.nextInt(10);
                    if (array[i] % 2 == 0 && array[i] != 0) {
                        count++;
                    }
                }

                int[] array2 = new int[count];
                int j = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] % 2 == 0 && array[i] != 0) {
                        array2[j] = array[i];
                        j++;

                    }
                }
                System.out.println(Arrays.toString(array));
                System.out.println(Arrays.toString(array2));
            } else {
                System.out.println("Input not correct,please retry");
            }
        }

    }
}
