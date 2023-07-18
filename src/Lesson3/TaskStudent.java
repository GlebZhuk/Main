package Lesson3;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskStudent {
    public static void main(String[] args) {
        int countStudents = 9;
        int countGroups = 3;
        Student[] student = new Student[countStudents];
        Random rnd = new Random();
        double[] average = new double[countGroups];
        int studentName = 1;
        int markerLowStudents = 0;
        int chose = 0;
        int chose2;
        int studentInGroup = countStudents / countGroups;
        int numberGroup = 0;

        for (int i = 0; i < student.length; i++) {
            student[i] = new Student("Student" + studentName, numberGroup, rnd.nextInt(10));
            average[numberGroup] += student[i].getMark();
            if (student[i].getMark() >= 4) {
                markerLowStudents++;
            }
            studentName++;
            if (studentInGroup == i + 1) {
                studentInGroup += studentInGroup;
                numberGroup++;
            }
        }
        Student[] stayStudentsGroup = new Student[markerLowStudents];

        //  LOWGROUP
        double min = average[0];
        int numberLowGroup = 0;
        for (int i = 0; i < countGroups; i++) {
            if (min > average[i]) {
                min = average[i];
                numberLowGroup = i;
            }
        }

        //MENU
        System.out.println("Make your chose:\n1.Show low group\n2.Delete low students\n3.Show all students\n4. Show group\n5.Exit");
        Scanner input = new Scanner(System.in);
        do {
            if (input.hasNextInt()) {
                chose = input.nextInt();
                switch (chose) {

                    case 1:
                        System.out.println("Low group is group №:" + (numberLowGroup + 1));
                        for (int i = 0; i < student.length; i++) {
                            if (numberLowGroup == student[i].getGroup())
                                System.out.println(student[i].getName() + " " + student[i].getMark());
                        }
                        break;

                    case 2:
                        System.out.println("Deleted students:");
                        for (int i = 0; i < student.length; i++) {
                            if (student[i].getMark() < 4)
                                System.out.println(student[i].getName() + " " + (student[i].getGroup() + 1) + " Mark:" + student[i].getMark());
                        }
                        int d = 0;
                        for (int i = 0; i < student.length; i++) {

                            if (student[i].getMark() >= 4) {
                                stayStudentsGroup[d] = student[i];
                                d++;
                            }
                        }

                        System.out.println("Remain group:");
                        for (int i = 0; i < markerLowStudents; i++) {
                            System.out.println(stayStudentsGroup[i].getName() + "Group  " + (stayStudentsGroup[i].getGroup() + 1) + " Mark:" + stayStudentsGroup[i].getMark());
                        }
                        break;

                    case 3:
                        for (int i = 0; i < student.length; i++) {
                            System.out.println(student[i].getName() + " " + (student[i].getGroup() + 1) + " Mark:" + student[i].getMark());
                        }
                        break;

                    case 4:
                        System.out.println("Chose group:");
                        chose2 = input.nextInt();
                        for (int i = 0; i < student.length; i++) {
                            if ((chose2 - 1) == student[i].getGroup())
                                System.out.println(student[i].getName() + " " + (student[i].getGroup() + 1) + " Mark:" + student[i].getMark());
                        }
                }
            } else System.out.println("Input is not correct!");
        } while (chose != 5);
    }
}
