package Aaron;

public class PasswordValidation {
    /*String -- Password Validation Task
    Write a return method that can verify if a password is valid or not.
    Requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns  false*/

    public static void main(String[] args) {
        System.out.println(PassWordvalidation("Ab*1Ab"));
        System.out.println(PassWordvalidation("Ab*1A "));
        System.out.println(isValidPassword("Ab*1Ab"));
        System.out.println(isValidPassword("AC*1AA"));
    }

    public static boolean PassWordvalidation(String password) {

        String lowercase = "(.*[a-z].*)";
        String uppercase = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialchars = "(.*[ -/, :-@].*)";

        boolean HasLower = password.matches(lowercase),
                HasUppere = password.matches(uppercase),
                HasDigits = password.matches(numbers),
                HasSpecial = password.matches(specialchars),
                Valid = false;

        if (password.length() >= 6 && !password.contains(" "))
            if (HasLower && HasUppere && HasDigits && HasSpecial)
                Valid = true;
        return Valid;
    }

    public static boolean isValidPassword(String password) {
        // Requirement 1: Password length should be at least 6 characters and should not contain space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isWhitespace(ch)) {
                hasSpecialChar = true;
            }
        }

        // Checking if all requirements are met
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }







}
