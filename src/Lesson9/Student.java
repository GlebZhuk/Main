package Lesson9;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String group;
    private int mark;
    private String name;

    public Student(String group, int mark, String name) {
        this.group = group;
        this.mark = mark;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                ", mark=" + mark +
                ", name='" + name + '\'' +
                '}';
    }

    public static void getStudentsByMark(ArrayList<Student> students, ArrayList<Student> studentsWellMark) {
        if (students.size() == 0) return;
        for (int i = 0; i < students.size(); i++) {
            Student current = students.get(i);
            if (current.getMark() > 8) {
                studentsWellMark.add(current);
            }
        }
    }

    public static void getStudentByGroup(ArrayList<Student> students, List<String> groups) {
        if (students.size() == 0) return;
        groups.add(students.get(0).getGroup());
        for (int i = 0; i < students.size(); i++) {
            if (!groups.contains(students.get(i).getGroup())) {
                groups.add(students.get(i).getGroup());
            }
        }
        int countStudents = 0;
        int minGroup = students.size();
        int counterGroup = 0;
        for (int j = 0; j < groups.size(); j++) {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getGroup().equals(groups.get(j))) {
                    countStudents++;
                }


            }
            if (minGroup > countStudents) {
                minGroup = countStudents;
                counterGroup = j;
            }
            countStudents = 0;
        }
        System.out.println("Min group:" + groups.get(counterGroup) + " students in that:" + minGroup);

    }

    public String getGroup() {
        return group;
    }

    public int getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }
}
