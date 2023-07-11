package Lesson3;

import java.util.Arrays;

public class Practic4 {
    public static void main(String[] args) {
        int [][] array={{12,45,4},{9,23,13,237,43,},{43,0,28}};
        int max=array[0][0];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                if (max<array[i][j]){
                    max=array[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("max= "+max);

    }
}
