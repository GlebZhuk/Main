package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class HomeTask5 {
    public static void main(String[] args) {
        int[] array =new int[10];
        int [] array2 =new int[10];
        Random rnd =new Random();
        for (int i=0;i< array.length;i++){
            array[i]=rnd.nextInt(10);
            array2[i]=array[i];
            if (i%2==1){
                array2[i]=0;
            }

        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}
