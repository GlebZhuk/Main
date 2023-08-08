package Lesson9;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        boolean run = true;
        String str = "((as[sq-<+>qwe]asq))[]";

        //DEQUE
       /* char[] charArray = str.toCharArray();
      Deque<Character> charsQue = new ArrayDeque<Character>();

        for (int i = 0; i < str.length(); i++) {
            if (charArray[i] == '<' | charArray[i] == '>' | charArray[i] == '[' | charArray[i] == ']' |
                    charArray[i] == '(' | charArray[i] == ')') {
                charsQue.add(charArray[i]);
            }
        }
        if (charsQue.size() % 2 == 1) {
            System.out.println("String is not correct");
            return;
        }
        System.out.println(charsQue);
       while (run) {
            if (charsQue.peekFirst() == '[' && charsQue.peekLast() == ']') {
                charsQue.removeFirst();
                charsQue.removeLast();
                System.out.println("1");
            } else if (charsQue.peekFirst() == '<' && charsQue.peekLast() == '>') {
                charsQue.removeFirst();
                charsQue.removeLast();
                System.out.println("2");
            } else if (charsQue.peekFirst() == '(' && charsQue.peekLast() == ')') {
                charsQue.removeFirst();
                charsQue.removeLast();
                System.out.println("3");
            } else {
                System.out.println("String is not correct");
                return;
            }
            if (charsQue.isEmpty()) run = false;
        }*/

        //STACK
        char[] charArray = str.toCharArray();

        Stack<Character> charsStack = new Stack<>();
        ArrayList<Character> sumbols = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (charArray[i] == '<' | charArray[i] == '>' | charArray[i] == '[' | charArray[i] == ']' |
                    charArray[i] == '(' | charArray[i] == ')') {
                sumbols.add(charArray[i]);
            }
        }
        System.out.println(sumbols);
        if (sumbols.size() % 2 == 1) {
            System.out.println("String is not correct");
            return;
        }
        for (int i = 0; i < sumbols.size(); i++) {
            if (sumbols.get(i) == '<' | sumbols.get(i) == '(' | sumbols.get(i) == '[') {
                charsStack.add(sumbols.get(i));
            } else if (sumbols.get(i) == '>' && charsStack.pop() == '<') {

            } else if (sumbols.get(i) == ')' && charsStack.pop() == '(') {

            } else if (sumbols.get(i) == ']' && charsStack.pop() == '[') {

            } else {
                System.out.println("String is not correct");
                return;
            }
        }
        System.out.println("String is correct");
    }
}
