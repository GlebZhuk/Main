package Lesson8.Practics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practic1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        if (str.isEmpty()){
            System.out.println("null");return;
        }
        String [] words=str.split(" ");
        if (words.length<2) {System.out.println("Input one word: "+words[0]);return;}
        int min=words[0].length();
        int minCount=0;
        int max=words[0].length();
        int maxCount=0;
        for (int i=0;i< words.length;i++){
            if (min>words[i].length()){
                min= words[i].length(); minCount=i;
            }
            if (max <words[i].length()){
                max=words[i].length(); maxCount=i;
            }
                    }
        System.out.println("Max length word "+words[maxCount]+" has length "+max);
        System.out.println("Min length word "+words[minCount]+" has length "+min);

    }
}
