package Lesson6.Homework.Task3.Registr;

import Lesson6.Homework.Task3.Document.Document;

import java.util.Arrays;

public class Registr {
    private static int i = 0;
    static Document[] array = new Document[10];

    public static void saveDoc(Document document) {
        array[i] = document;
        i++;
    }

    public static void showInfo() {
        for (int j = 0; j < array.length; j++) {
            if (array[j] != null)
                System.out.println(array[j].toString());

        }
    }


}
