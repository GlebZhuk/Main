package Lesson8.HomeWork.Task1;

import java.util.Scanner;

public class DocumentsNumber {

    public static void revise(String str) {
        if (str == null) {
            System.out.println("You input nothing");
            return;
        }
        if (str.length() != 22) {
            System.out.println("Incorrect length of symbols");
            return;
        }
        char[] chars = str.toCharArray();
        for (int i = 0; i < 4; i++) {
            if (!Character.isDigit(chars[i])) {
                System.out.println("Incorrect numbers");
                return;
            }
        }
        if (chars[4] != '-' | chars[8] != '-' | chars[13] != '-' | chars[17] != '-') {
            System.out.println("Incorrect symbol");
            return;
        }
        for (int i = 5; i < 8; i++) {
            if (!Character.isLetter(chars[i])) {
                System.out.println("Incorrect letters");
                return;
            }
        }
        for (int i = 9; i < 13; i++) {
            if (!Character.isDigit(chars[i])) {
                System.out.println("Incorrect numbers");
                return;
            }
        }
        for (int i = 14; i < 17; i++) {
            if (!Character.isLetter(chars[i])) {
                System.out.println("Incorrect letters");
                return;
            }
        }
        if (!Character.isDigit(chars[18]) && !Character.isLetter(chars[19]) && !Character.isDigit(chars[20]) && !Character.isLetter(chars[21])) {
            System.out.println("Incorrect last number");
            return;
        }
        System.out.println("Document's number is correct");
    }

    public static void showNumbers(String str) {
        System.out.print(str.substring(0, 4) + " ");
        System.out.println(str.substring(9, 13));
    }

    public static void replaceLetters(String str) {
        str = str.replace(str.substring(5, 8), "***");
        str = str.replace(str.substring(14, 17), "***");
        System.out.println(str);
    }

    public static void showLetterLowerCase(String str) {
        str = str.toLowerCase();
        System.out.print(str.substring(5, 8));
        System.out.print('/');
        System.out.print(str.substring(14, 17));
        System.out.print('/');
        System.out.print(str.charAt(19));
        System.out.print('/');
        System.out.println(str.charAt(21));
    }

    public static void showLetterUpperCase(String str) {
        str = str.toUpperCase();

        StringBuilder newStr = new StringBuilder(str.substring(5));
        newStr.replace(3, 9, "/");
        newStr.replace(7, 9, "/");
        newStr.replace(9, 10, "/");
        System.out.println(newStr);
    }

    public static void reviseContains(String str) {
        str = str.toUpperCase();
        if (str.contains("ABC")) {
            System.out.println("Our string contains 'ABC'");
        } else System.out.println("Our string doesnt contain 'ABC'");


    }

    public static void reviseStart(String str) {
        if (str.startsWith("555")) {
            System.out.println("Our string starts with '555'");
        } else System.out.println("Our string doesnt start with '555'");
    }

    public static void reviseFinish(String str) {
        if (str.endsWith("1a2b")) {
            System.out.println("Our string finishes on '1a2b'");
        } else System.out.println("Our string doesnt finish on '1a2b'");
    }
}





