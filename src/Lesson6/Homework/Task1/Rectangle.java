package Lesson6.Homework.Task1;

public class Rectangle extends Figure {
    private double side1;
    private double side2;


    Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void square() {
        super.setS(side1 * side2);

    }

    @Override
    public void perimetr() {
        super.setP((side1 + side2) * 2);
    }
}
