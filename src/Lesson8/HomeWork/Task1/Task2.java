package Lesson8.HomeWork.Task1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input String");
        String str = input.nextLine();
        if (str.isEmpty()) return;
        String[] words = str.split(" ");
        if (words.length < 2) System.out.println("input one word");
        int minChar = words[0].length();
        int maxChar = words[0].length();
        int minWord = 0;
        int maxWord = 0;
        for (int i = 0; i < words.length; i++) {
            if (minChar > words[i].length()) {
                minChar = words[i].length();
                minWord = i;
            }
            if (maxChar < words[i].length()) {
                maxChar = words[i].length();
                maxWord = i;
            }
        }
        System.out.println("Max word: " + words[maxWord] + ",have length " + maxChar + "\nMin word: " + words[minWord] + ",have length " + minChar);
    }
}
