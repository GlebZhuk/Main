package Lesson4.Practic;

public class CatMain {
    public static void main(String[] args) {
        Cat cat=new Cat("Barsik",  5,8);
        System.out.println(cat.feed(9) ? "notHungry" : "Hungry");
    }
}
