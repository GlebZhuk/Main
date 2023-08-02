package Lesson8.HomeWork.Task1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input line");
        String str = input.nextLine();
        if (str.isEmpty()) return;
        String[] words = str.split(" ");
        if (words.length < 2) System.out.println("Input one word");
        int minWordSumbol = words[0].length();
        String minWord = null;

        for (String word : words) {

            int uniqueSumbols = 0;
            char[] charArray = word.toCharArray();
            for (int i = 0; i < charArray.length; i++) {

                if (!Character.isDigit(charArray[i]) && !Character.isLetter(charArray[i]) && !Character.isSpace(charArray[i])) {
                    System.out.println("Only numbers or letters");
                    return;
                }

                for (int j = i; j < charArray.length - 1; j++) {
                    if (charArray[i] == charArray[j + 1]) {
                        uniqueSumbols++;
                    }
                }
            }
            if (minWordSumbol > uniqueSumbols) {
                minWordSumbol = uniqueSumbols;
                minWord = word;
            }
        }
        System.out.println(minWord + " " + minWordSumbol);
    }
}
