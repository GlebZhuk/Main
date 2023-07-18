package Lesson4.Practic;

import java.util.Arrays;

public class Practic {
    public static void main(String[] args) {

        Student[] student = new Student[14];
        for (int i = 0; i < student.length; i++) {

            student[i] = new Student("Name" + i);
            student[i].showInfo();
            student[i].bestStudents();
        }
        System.out.println("Best students:");
        for (int i = 0; i < student.length; i++) {
            student[i].bestStudents();
        }
    }

}
