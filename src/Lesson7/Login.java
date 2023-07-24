package Lesson7;

import java.util.Scanner;

public class Login {
    private static String login;

    public static boolean createLogin() {

        try {
            Login.reviseLogin();
            return true;

        } catch (WrongLoginException e) {
            return false;
        }
    }

    public static void reviseLogin() throws WrongLoginException {
        System.out.println("Login:");
        Scanner input = new Scanner(System.in);
        login = input.next();
        for (int i = 0; i < login.length(); i++) {
            if (login.charAt(i) == ' ' | login.length() >= 20) {
                WrongLoginException e = new WrongLoginException("WrongLoginException");
                System.out.println("Login is not correct");
                throw e;
            }
        }


    }
}
