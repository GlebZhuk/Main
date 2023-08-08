package Lesson10;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Student student1 = new Student("Dima", 7);
        Student student2 = new Student("Peter", 8);
        Student student3 = new Student("Maxim", 5);

        Map<Integer, String> studentsMap = new HashMap<Integer, String>();
        studentsMap.put(student1.getMark(), student1.getName());
        studentsMap.put(student2.getMark(), student2.getName());
        studentsMap.put(student3.getMark(), student3.getName());

        Set<Integer> keys = studentsMap.keySet();
        Collection<String> names = studentsMap.values();

        System.out.println("students with names " + names + "\nhave marks: " + keys);
        int min = 10;
        String lowStudent = null;
        System.out.println("Count of students: " + studentsMap.size());

        for (Map.Entry<Integer, String> item : studentsMap.entrySet()) {
            if (min > item.getKey()) {
                min = item.getKey();
                lowStudent = item.getValue();
            }
        }

        System.out.println("Low student: " + lowStudent + " with mark: " + min);
    }


}
