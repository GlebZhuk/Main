package Lesson8.Practics;

import java.util.Scanner;

public class Practic2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        if (str.isEmpty()){
            System.out.println("null");return;
        }
        String [] words=str.split(" ");
        if (words.length<2) {System.out.println("Input one word: "+words[0]);return;}
        int arrayLength=0;
        for (int i=0;i< words.length;i++){
            arrayLength+=words[i].length();
        }
        arrayLength/= words.length;
        System.out.println("Array length: "+arrayLength);
        for (int i=0;i< words.length;i++){
            if (words[i].length()>arrayLength)
                System.out.println(words[i]+" has length "+words[i].length());
        }
    }
}
