package Lesson3;

public class HomeTask3 {
    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4, 5};
        int array2[] = {1, 2, 3, 4, 5};
        double average1=0, average2=0;
        for (int i = 0; i < 5; i++) {
            average1 += array1[i];
            average2 += array2[i];
        }
        if (average1 / 5 > average2 / 5) {
            System.out.println("average1>average2");
        } else if (average1 / 5 < average2 / 5) {
            System.out.println("average2>average1");
        } else {
            System.out.println("average1=average2");
        }
    }
}

