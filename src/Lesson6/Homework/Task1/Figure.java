package Lesson6.Homework.Task1;

public abstract class Figure {
    private double s;
    private double p;


    public abstract void square();

    public abstract void perimetr();


    public double getP() {
        return p;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public void setP(double p) {
        this.p = p;
    }
}
