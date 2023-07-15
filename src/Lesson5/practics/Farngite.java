package Lesson5.practics;

public class Farngite extends BaseConverter{
    public Farngite(int t) {
        super(t);}
        @Override
        public void convert() {

            System.out.println("Температура по Фаренгейту " + (1.8*super.getT() + 32));
        }
    }

