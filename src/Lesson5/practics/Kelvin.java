package Lesson5.practics;

public class Kelvin extends BaseConverter {

    public Kelvin(int t) {
        super(t);
    }
    @Override
    public void convert() {

        System.out.println("Температура по Кельвину " + (super.getT() + 273.15));
    }
}

