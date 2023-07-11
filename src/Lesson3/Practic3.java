package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practic3 {
    public static void main(String[] args) {
        int n=0;
        Scanner input = new Scanner(System.in);
        if(input.hasNextInt()){
            n=input.nextInt();
        }
        int[] array=new int[n];
        Random rnd =new Random();
        for (int i=0;i<n;i++){
            array[i]=rnd.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
    }
}
