package utils;

public final class CommonValidations {
    
    public static boolean isValidEmail(String email) {
        return java.util.regex.Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email);
    }

    public static boolean isValidPassword(String password) {
        return password.length() >= 8;
    }
}
