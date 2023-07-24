package Lesson7;

import java.util.Scanner;

public class Password {
    private static String password;
    private static String confirmPassword;

    public static boolean createPassword() {
        try {
            Password.revisePassword();
            return true;
        } catch (WrongPasswordException e) {
            System.out.println("Password is not correct");
            return false;
        }
    }

    public static void revisePassword() throws WrongPasswordException {
        System.out.println("Password:");
        Scanner input = new Scanner(System.in);
        password = input.next();
        char[] chars = password.toCharArray();
        for (char i : chars) {
            if (!Character.isDigit(i)) {
                return;
            }
        }
        WrongPasswordException e = new WrongPasswordException("Exception password");
        throw e;
    }

    public static boolean catchConfirmPassword() {
        try {
            Password.confirmPassword();
            return true;
        } catch (WrongPasswordException e) {
            System.out.println("Password is not the same");
            return false;
        }
    }

    public static void confirmPassword() throws WrongPasswordException {
        System.out.println("Confirm password:");
        Scanner input = new Scanner(System.in);
        confirmPassword = input.next();
        if (password.equals(confirmPassword)) {
            return;
        }
        WrongPasswordException e = new WrongPasswordException("Password is not the same");
        throw e;
    }
}
