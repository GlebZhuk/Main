package Lesson6.Homework.Task1;

public class Triangle extends Figure {
    private double side1;
    private double side2;
    private double side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void perimetr() {
        setP(side1 + side2 + side3);
    }

    @Override
    public void square() {
        super.setS(Math.sqrt(super.getP() / 2 * ((super.getP() / 2 - side1) * (super.getP() / 2 - side2) * (super.getP() / 2 - side3))));
    }

}
