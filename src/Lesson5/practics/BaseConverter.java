package Lesson5.practics;

public class BaseConverter {
    private int t;

    public BaseConverter(int t) {
        this.t = t;
    }

    public void convert() {
        System.out.println("Температура по Цельсию " + getT());
    }

    public int getT() {
        return t;
    }


}
