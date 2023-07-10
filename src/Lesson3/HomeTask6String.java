package Lesson3;


import java.util.Arrays;
import java.util.Random;

public class HomeTask6String {
    String[] array = new String[6];

    public static String makeString() {

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int Length = 6;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(Length);
        for (int i = 0; i < Length; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        return generatedString;
    }


    public static void main(String[] args) {

        String[] array = new String[6];
        for (int i = 0; i < 6; i++) {
            array[i] = makeString();
        }


        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
