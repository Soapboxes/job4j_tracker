package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printError() {
        System.out.println("Ошибки: " + active);
        System.out.println("Кол-во: " + status);
        System.out.println("Характер: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 1, "критическая");
        Error errorLost = new Error();
        error.printError();
        errorLost.printError();
    }
}
