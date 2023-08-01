package Lesson9;


import java.util.List;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Group3", 7, "Kevin");
        Student student2 = new Student("Group2", 10, "Nik");
        Student student3 = new Student("Group3", 9, "Sten");
        Student student4 = new Student("Group2", 5, "Dima");
        Student student5 = new Student("Group1", 9, "Pavel");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        List<Student> studentsWellMark = new ArrayList<>();
        List<String> groups = new ArrayList<>();
        Student.getStudentsByMark((ArrayList<Student>) students, (ArrayList<Student>) studentsWellMark);
        System.out.println(studentsWellMark);
        Student.getStudentByGroup((ArrayList<Student>) students, (ArrayList<String>) groups);

    }
}

