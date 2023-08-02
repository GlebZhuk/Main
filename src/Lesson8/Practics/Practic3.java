package Lesson8.Practics;

import java.util.Scanner;

public class Practic3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter line 1");
        String str1=input.nextLine();
        if (str1.isEmpty()){
            System.out.println("null");return;
        }
        System.out.println("Enter line 2");
        String str2=input.nextLine();
        if (str2.isEmpty()){
            System.out.println("null");return;
        }
        System.out.println("Enter line 3");
        String str3=input.nextLine();
        if (str3.isEmpty()){
            System.out.println("null");return;
        }
        System.out.println("Line 3: "+str3);
        System.out.println("Line 2: "+str2.toUpperCase());
        System.out.println("Line 1: "+str1.toLowerCase());

    }
}
