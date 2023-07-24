package Lesson7;

public class Method {
    public static boolean method(boolean createLogin, boolean createPassword, boolean catchConfirmPassword) {
        if (createLogin && createPassword && catchConfirmPassword) {
            System.out.println("Well done");
             return true;
        }
        return false;
    }
}
