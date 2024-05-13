package ru.job4j.early;

public class PasswordValidator {
    private static final String[] FORBIDDEN = {"qwerty", "12345", "password", "admin", "user"};
    private static final int MAX_LONG = 32;
    private static final int MIN_LONG = 8;

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() > MAX_LONG || password.length() < MIN_LONG) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        boolean hasUpCase = false;
        boolean hasLowCase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (char symbol : password.toCharArray()) {
            if (Character.isUpperCase(symbol)) {
                hasUpCase = true;
            }
            if (Character.isLowerCase(symbol)) {
                hasLowCase = true;
            }
            if (Character.isDigit(symbol)) {
                hasDigit = true;
            }
            if (!Character.isLetterOrDigit(symbol)) {
                hasSpecial = true;
            }
            if (hasUpCase && hasLowCase && hasDigit && hasSpecial) {
                break;
            }
        }
        if (!hasUpCase) {
            throw new IllegalArgumentException(
                    "Password should contain at least one uppercase letter"
            );
        }
        if (!hasLowCase) {
            throw new IllegalArgumentException(
                    "Password should contain at least one lowercase letter"
            );
        }
        if (!hasDigit) {
            throw new IllegalArgumentException(
                    "Password should contain at least one figure"
            );
        }
        if (!hasSpecial) {
            throw new IllegalArgumentException(
                    "Password should contain at least one special symbol"
            );
        }
        for (String pass : FORBIDDEN) {
            if (password.toLowerCase().contains(pass)) {
                throw new IllegalArgumentException(
                        "Password shouldn't contain substrings: qwerty, "
                                + "12345, password, admin, user"
                );
            }
        }
        return password;
    }
}