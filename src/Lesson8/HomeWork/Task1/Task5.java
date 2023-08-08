package Lesson8.HomeWork.Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j = 0;
        System.out.println("Input line");
        String str = input.nextLine();
        if (str.isEmpty()) return;
        char[] charArray = str.toCharArray();
        char[] charArrayDouble = new char[(charArray.length * 2)];
        for (int i = 0; i < charArray.length; i++) {
            charArrayDouble[j] = charArray[i];
            charArrayDouble[j + 1] = charArray[i];
            j += 2;
        }
        System.out.println(Arrays.toString(charArrayDouble));
    }
}
