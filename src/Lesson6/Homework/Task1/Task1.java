package Lesson6.Homework.Task1;

public class Task1 {
    public static void main(String[] args) {
        double arraySum = 0;

        Figure array[] = new Figure[5];
        array[0] = new Triangle(2, 3, 2);
        array[1] = new Rectangle(4, 3);
        array[2] = new Circle(3);
        array[3] = new Rectangle(8, 7);
        array[4] = new Circle(6);
        for (int i = 0; i < array.length; i++) {
            array[i].perimetr();
            arraySum += array[i].getP();
        }
        System.out.println(arraySum);
    }
}
