package Lesson5.practics;

public class Practic2 {
    public static void main(String[] args) {
        BaseConverter temperature = new BaseConverter(10);
        temperature.convert();
        BaseConverter temperature2 = new Kelvin(temperature.getT());
        temperature2.convert();
        BaseConverter temperature3=new Farngite(temperature.getT());
        temperature3.convert();
    }
}
