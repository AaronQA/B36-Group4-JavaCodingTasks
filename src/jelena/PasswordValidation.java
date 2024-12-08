package jelena;

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

        System.out.println(passwordValidation("MBHG%$#hjuy123"));//true
        System.out.println(passwordValidation("MB HG%$#hjuy123"));//false
        System.out.println(passwordValidation("Ad%6"));//false
        System.out.println(passwordValidation("-2agHJUO)"));//false
        System.out.println(passwordValidation("jjshyeunbljvuhvu"));
    }


    public static boolean passwordValidation(String password) {

        boolean result = false;
        if (password.length() < 6) {
            return false;
        }

        // Flags for each condition
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;


        // Iterate through each character in the password
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isSpaceChar(ch)) { //ako naidje na space vratice false
                return false;
            }


            // Check if it's an uppercase letter
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
            // Check if it's a lowercase letter
            else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            }
            // Check if it's a special character ????????
            else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
            }
            // Check if it's a digit
            else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }


        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }

}



