package Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        if (input.hasNextInt()) {
            n = input.nextInt();
        }
        int[] array = new int[n];
        int max = 0;
        int min = 0;
        int average = 0;

        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        if (array != null && array.length >= 1) {
            max = array[0];
            min = array[0];
        }

        for (int i = 0; i < n; i++) {

            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
            average += array[i];
        }
        average = average / n;
        System.out.println(Arrays.toString(array));
        System.out.println("max= " + max);
        System.out.println("min= " + min);
        System.out.println("average= " + average);
    }
}
