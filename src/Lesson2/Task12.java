package Lesson2;

public class Task12 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        System.out.println(a);
        for (int i = 1; i < 11; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
