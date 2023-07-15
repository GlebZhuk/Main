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
        int lowGroup;
        int markerLowStudents=0;
        int chose = 0;
        int chose2;
        int studentInGroup = countStudents / countGroups;
        int numberGroup =0;
int studentInGroupCount=studentInGroup;

        for (int i = 0; i < student.length; i++) {

            student[i] = new Student("Student" + studentName, numberGroup, rnd.nextInt(10));
            if (student[i].getMark() >= 4) {markerLowStudents++;}
            studentName++;
            average[numberGroup] += student[i].getMark();
            if (studentInGroup == i+1) {
                // double aver=average[i]/countStudents/countGroups;
                average[numberGroup] = average[numberGroup]/studentInGroupCount;
                numberGroup++;
                studentInGroup+=studentInGroup;

            }

        }


        Student[] stayStudentsGroup = new Student[markerLowStudents];

      //  LOWGROUP
        double min=average[0];
        int numberLowGroup=0;
      for (int i=0;i<countGroups;i++){
        if (min<average[i]) {min=average[i];numberLowGroup=i;}
      }

        //MENU
        System.out.println("Make your chose:\n1.Show low group\n2.Delete low students\n3.Show all students\n4. Show group\n5.Exit");
        Scanner input = new Scanner(System.in);
        do {
            if (input.hasNextInt()) {
                chose = input.nextInt();
                switch (chose) {

                    case 1:

                           System.out.println("Low group is group №:" + numberLowGroup);
                         for (int i = 0; i < student.length; i++) {
                             if (numberLowGroup==student[i].getGroup())
                          System.out.println(student[i].getName() + " " + student[i].getMark());
                         }

                        break;

                    case 2:
                        System.out.println("Deleted students:");
                        for (int i = 0; i < student.length; i++) {

                                if (student[i].getMark() < 4)
                                    System.out.println(student[i].getName() + " " + student[i].getGroup() + " Mark:" + student[i].getMark());
                            }

                        int d=0;
                      for (int i = 0; i <student.length; i++) {

                                if (student[i].getMark() >= 4) {
                                    stayStudentsGroup[d] = student[i];
                                    d++;
                                }
                            }

                        System.out.println("Remain group:");
                                            for (int i = 0; i < markerLowStudents; i++) {
                                System.out.println(stayStudentsGroup[i].getName() + "Group  " + stayStudentsGroup[i].getGroup() + " Mark:" + stayStudentsGroup[i].getMark());
                            }

                        break;

                    case 3:
                        for (int i = 0; i < student.length; i++) {

                                System.out.println(student[i].getName() + " " + student[i].getGroup() + " Mark:" + student[i].getMark());
                            }

                        break;

                    case 4:
                        /*System.out.println("Chose group:\n1-Show group1;\n2-Show group2;\n3-Show group3.");
                        chose2 = input.nextInt();
                        if (chose2 == 1) {
                            for (int i = 0; i < markerLowStudents[1]; i++) {
                                System.out.println(stayStudentsGroup[0][i].getName() + " " + stayStudentsGroup[0][i].getGroup() + " Mark:" + stayStudentsGroup[0][i].getMark());
                            }
                        }
                        if (chose2 == 2) {
                            for (int i = 0; i < markerLowStudents[1]; i++) {
                                System.out.println(stayStudentsGroup[1][i].getName() + " " + stayStudentsGroup[1][i].getGroup() + " Mark:" + stayStudentsGroup[1][i].getMark());
                            }
                        }
                        if (chose2 == 3) {
                            for (int i = 0; i < markerLowStudents[1]; i++) {
                                System.out.println(stayStudentsGroup[2][i].getName() + " " + stayStudentsGroup[2][i].getGroup() + " Mark:" + stayStudentsGroup[2][i].getMark());
                            }
                        }*/
                }

            } else System.out.println("Input is not correct!");

        } while (chose != 5);
    }

}
/*
public class TaskStudent {
    public static void main(String[] args) {
        Student[][] student = new Student[3][3];
        Random rnd = new Random();
        double[] average = new double[3];
        int studentName = 1;
        int lowGroup;
        int[] markerLowStudents = new int[3];
        int chose = 0;
        int chose2;
        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < student[i].length; j++) {
                student[i][j] = new Student("Student" + studentName, "Group " + (i + 1), rnd.nextInt(10));
                if (student[i][j].getMark() >= 4) markerLowStudents[i]++;
                studentName++;
                average[i] += student[i][j].getMark();
            }
            average[i] = average[i] / 3;
        }

        Student[][] stayStudentsGroup = new Student[3][];
        stayStudentsGroup[0] = new Student[markerLowStudents[0]];
        stayStudentsGroup[1] = new Student[markerLowStudents[1]];
        stayStudentsGroup[2] = new Student[markerLowStudents[2]];
        //LOWGROUP
        if (average[0] < average[2] && average[0] < average[1]) lowGroup = 0;
        else if (average[2] < average[1] && average[2] < average[0]) lowGroup = 2;
        else if (average[1] < average[2] && average[1] < average[0]) lowGroup = 1;
        else lowGroup = 4;

        //MENU
        System.out.println("Make your chose:\n1.Show low group\n2.Delete low students\n3.Show all students\n4. Show group\n5.Exit");
        Scanner input = new Scanner(System.in);
        do {
            if (input.hasNextInt()) {
                chose = input.nextInt();
                switch (chose) {

                    case 1:
                        if (lowGroup < 4) {
                            System.out.println("Low group is group №:" + (lowGroup + 1));
                            for (int j = 0; j < student[lowGroup].length; j++) {
                                System.out.println(student[lowGroup][j].getName() + " " + student[lowGroup][j].getMark());
                            }
                        } else System.out.println("Low group is not exist");
                        break;

                    case 2:
                        System.out.println("Deleted students:");
                        for (int i = 0; i < student.length; i++) {
                            for (int j = 0; j < student[i].length; j++) {
                                if (student[i][j].getMark() < 4)
                                    System.out.println(student[i][j].getName() + " " + student[i][j].getGroup() + " Mark:" + student[i][j].getMark());
                            }
                        }
                        for (int i = 0; i < 3; i++) {
                            int d = 0;
                            for (int j = 0; j < 3; j++) {
                                if (student[i][j].getMark() >= 4) {
                                    stayStudentsGroup[i][d] = student[i][j];
                                    d++;
                                }
                            }
                        }
                        System.out.println("Remain group:");
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < markerLowStudents[i]; j++) {
                                System.out.println(stayStudentsGroup[i][j].getName() + " " + stayStudentsGroup[i][j].getGroup() + " Mark:" + stayStudentsGroup[i][j].getMark());
                            }
                        }
                        break;

                    case 3:
                        for (int i = 0; i < student.length; i++) {
                            for (int j = 0; j < student[i].length; j++) {
                                System.out.println(student[i][j].getName() + " " + student[i][j].getGroup() + " Mark:" + student[i][j].getMark());
                            }
                        }
                        break;

                    case 4:
                        System.out.println("Chose group:\n1-Show group1;\n2-Show group2;\n3-Show group3.");
                        chose2 = input.nextInt();
                        if (chose2 == 1) {
                            for (int i = 0; i < markerLowStudents[1]; i++) {
                                System.out.println(stayStudentsGroup[0][i].getName() + " " + stayStudentsGroup[0][i].getGroup() + " Mark:" + stayStudentsGroup[0][i].getMark());
                            }
                        }
                        if (chose2 == 2) {
                            for (int i = 0; i < markerLowStudents[1]; i++) {
                                System.out.println(stayStudentsGroup[1][i].getName() + " " + stayStudentsGroup[1][i].getGroup() + " Mark:" + stayStudentsGroup[1][i].getMark());
                            }
                        }
                        if (chose2 == 3) {
                            for (int i = 0; i < markerLowStudents[1]; i++) {
                                System.out.println(stayStudentsGroup[2][i].getName() + " " + stayStudentsGroup[2][i].getGroup() + " Mark:" + stayStudentsGroup[2][i].getMark());
                            }
                        }
                }

            } else System.out.println("Input is not correct!");

        } while (chose != 5);
    }

}*/
