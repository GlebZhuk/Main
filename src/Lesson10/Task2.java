package Lesson10;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> numbersList = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 6; i++) {
            numbersList.add(rnd.nextInt(5));
            System.out.print(numbersList.get(i));
        }
        System.out.println();
        Map<Integer, Integer> numbersMap = new HashMap<>();
        for (int i = 0; i < 6; i++) {
            int countNumber = 1;
            if (!numbersMap.containsKey(numbersList.get(i))) {
                for (int j = i; j < 5; j++) {
                    if (numbersList.get(i) == numbersList.get(j + 1)) {
                        countNumber++;
                    }
                }
                numbersMap.put(numbersList.get(i), countNumber);
            }
        }

        for (Map.Entry<Integer, Integer> item : numbersMap.entrySet()) {
            System.out.println("Number " + item.getKey() + " has " + item.getValue() + " repeats");
        }


    }
}
