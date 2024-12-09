package Stepan;

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

        System.out.println(validatePassword("abcD3$")); // output: true
        System.out.println(validatePassword("abc D3$"));// output: false
        System.out.println(validatePassword("abcd3$")); // output: false
        System.out.println(validatePassword("abcDE$")); // output: false
        System.out.println(validatePassword("ABCD3$")); // output: false
        System.out.println(validatePassword("abcD3F")); // output: false
        System.out.println(validatePassword("abC3$"));  // output: false
        System.out.println(validatePassword(null));     // output: false
        System.out.println(validatePassword(""));       // output: false

    }

    public static boolean validatePassword(String password) {

        // Initialize flags for validation
        boolean isUpperCase = false, isLowerCase = false, isSpecChar = false, isDigit = false;

        // Checks password length, null and spaces
        if (password == null || password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Iterates through the password to validate
        for (int i = 0; i < password.length(); i++) {

            char letter = password.charAt(i);

            if (Character.isUpperCase(letter)) {
                isUpperCase = true;
            }
            if (Character.isLowerCase(letter)) {
                isLowerCase = true;
            }
            if (Character.isDigit(letter)) {
                isDigit = true;
            }
            if (!Character.isAlphabetic(letter) && !Character.isDigit(letter)) {
                isSpecChar = true;
            }

            // Early exits if all conditions are met
            if (isUpperCase && isLowerCase && isSpecChar && isDigit) {
                return true;
            }

        }

        // Returns false if any condition is not met
        return false;

    }

}