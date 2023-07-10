package Lesson3;

import java.util.Arrays;

public class Practic1 {

    public static void main(String[] args) {
        int[] array = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
        int max=0;

        if (array[0] != 0 && array.length >= 1) {
            max = array[0];
        }
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);

   }
}
