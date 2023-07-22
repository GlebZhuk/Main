package Lesson6.Homework.Task1;

public class Circle extends Figure {

    private double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    public void square() {
        super.setS(3.14 * r);
    }

    @Override
    public void perimetr() {
        setP(2 * 3.14 * r);

    }

}
