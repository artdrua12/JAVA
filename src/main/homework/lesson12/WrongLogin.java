package main.homework.lesson12;

public class WrongLogin extends Exception{

    private String message;

    public WrongLogin(String message) {
        this.message = message;
    }

    public String toString() {
        return message;
    }
}
