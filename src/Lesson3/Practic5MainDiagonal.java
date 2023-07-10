package Lesson3;

public class Practic5MainDiagonal {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sumMain = 0;
        int sumSecond = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sumMain += array[i][j];
                }
                if (j == array.length - 1 - i) {
                    sumSecond += array[i][j];
                }
            }
        }
        System.out.println(sumMain);
        System.out.println(sumSecond);
    }
}
