package Lesson7;

public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException(){}
    public WrongPasswordException(String message){
        super(message);
    }
}
