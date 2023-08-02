package Lesson8.HomeWork.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Input document number in format XXXX-YYY-XXXX-YYY-XYXY\n where X-numbers, y - letters");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        // String str = "5554-aBc-5678-ZxC-1a2b"; //for example
        DocumentsNumber.revise(str);
        DocumentsNumber.showNumbers(str);
        DocumentsNumber.replaceLetters(str);
        DocumentsNumber.showLetterLowerCase(str);
        DocumentsNumber.showLetterUpperCase(str);
        DocumentsNumber.reviseContains(str);
        DocumentsNumber.reviseStart(str);
        DocumentsNumber.reviseFinish(str);
    }
}
