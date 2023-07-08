package Lesson2;

public class Task11 {
    public static void main(String[] args) {
        int a = 10;
        int b;
        for (int i = 1; i <= 11; i++) {
            b = (int) Math.pow(a, 2);
            System.out.println(b);
            a++;
        }
    }
}
