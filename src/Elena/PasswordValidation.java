package Elena;

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

        String[] testPasswords = {
                "Abc123!", "Aa1!23", "StrongPass123$",
                null, "Abc 123!", "A1!bc",
                "abc123!", "ABC123!", "Abcdef!",
                "Abc1234", "@#$%^&", "A1a!",
                "AAAAAA", "Abc123!@#$%^&*()_+~"
        };

        for (String password : testPasswords) {
            try {
                System.out.println("Password: " + password);
                System.out.println("Result: " + isValidPassword(password));
            } catch (IllegalArgumentException e) {
                System.err.println("Exception: " + e.getMessage());
            }
            System.out.println();
        }
    }

    public static boolean isValidPassword(String password) {
        if (password == null) {
            System.err.println("Password cannot be null");
            throw new IllegalArgumentException("A password cannot be null");
        }

        if (password.contains(" ")) {
            System.err.println("Invalid Password");
            throw new IllegalArgumentException("A password cannot contain spaces");
        }

        boolean hasAtLeast6Chars = password.length() >= 6;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < password.length(); i++) {
            char eachChar = password.charAt(i);
            if (Character.isUpperCase(eachChar)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(eachChar)) {
                hasLowerCase = true;
            } else if (Character.isDigit(eachChar)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }

        boolean isStrongPassword = hasAtLeast6Chars && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;

        if (!hasAtLeast6Chars) {
            System.out.println("Password is too short. It must have at least 6 characters.");
        }
        if (!hasUpperCase) {
            System.out.println("Password must contain at least one uppercase letter.");
        }
        if (!hasLowerCase) {
            System.out.println("Password must contain at least one lowercase letter.");
        }
        if (!hasDigit) {
            System.out.println("Password must contain at least one digit.");
        }
        if (!hasSpecialChar) {
            System.out.println("Password must contain at least one special character.");
        }

        if (isStrongPassword) {
            System.out.println(password + " is a Strong & Valid Password");
            return true;
        } else {
            System.out.println(password + " is a Weak & Not Valid Password");
            return false;
        }
    }
}