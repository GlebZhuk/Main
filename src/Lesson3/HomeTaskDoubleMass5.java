package Lesson3;

import java.util.Arrays;

public class HomeTaskDoubleMass5 {
    public static void sort(int[][] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            int rightside = array[i].length - 1;
            int leftside = 0;
            do {
                for (int j = leftside; j < rightside; j++) {
                    if (array[i][j] > array[i][j + 1]) {
                        temp = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = temp;
                    }
                }
                rightside--;
                for (int j = rightside; j > leftside; j--) {
                    if (array[i][j] < array[i][j - 1]) {
                        temp = array[i][j];
                        array[i][j] = array[i][j - 1];
                        array[i][j - 1] = temp;
                    }
                }
                leftside++;
            } while (leftside < rightside);
        }
    }

    public static void main(String[] args) {

        int[][] array = {{7, 3, 2, 8}, {8, 4}, {10, 23, 5, 1}};
        System.out.println(Arrays.deepToString(array));
        for (int i = 0; i < 3; i++) {
            sort(array);
        }
        System.out.println(Arrays.deepToString(array));
    }
}
