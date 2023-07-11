package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeTaskDoubleMass0 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [][][] array=new int[3][2][3];
        Random rnd=new Random();
        for (int i=0; i< array.length;i++){
            for (int j=0;j<array[i].length;j++){
                for (int z=0;z<array[i][j].length;z++){
                    array[i][j][z]= rnd.nextInt(10);

                }
            }
        }
        System.out.println(Arrays.deepToString(array));
        int count=0;
        System.out.println("increase array on: ");
        if (input.hasNextInt()){
            count= input.nextInt();
        }
      for(int i=0;i<array.length;i++){
          for (int j=0; j< array[i].length;j++){
              for (int z=0;z<array[i][j].length;z++){
                  array[i][j][z]+=count;
              }
          }
      }
        System.out.println(Arrays.deepToString(array));
    }
}
