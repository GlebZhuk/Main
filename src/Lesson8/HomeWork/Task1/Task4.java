package Lesson8.HomeWork.Task1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input line");
        String str = input.nextLine();
        if (str.isEmpty()) return;
        String[] words = str.split(" ");
        System.out.println("Chose word on number: max number - " + words.length);
        if (!input.hasNextInt()) return;
        int wordNumber = input.nextInt();
        if (wordNumber > words.length) {
            System.out.println("Number is not correct");
            return;
        }
        StringBuilder polindrom = (new StringBuilder(words[wordNumber - 1]).reverse());
        if (String.valueOf(polindrom).equals(words[wordNumber - 1])) {
            System.out.println("word is polindrom");
        } else System.out.println("word is not polindrom");

    }
}
