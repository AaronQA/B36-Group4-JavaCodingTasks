package Serge;

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
        System.out.println(passwordValidation("123"));     //Password is too short
        System.out.println(passwordValidation("123456"));  //PassWord should at least contain one upper case letter
        System.out.println(passwordValidation("S12345A")); //PassWord should at least contain one lower case letter
        System.out.println(passwordValidation("S12345s")); //PassWord should at least contain one special characters
        System.out.println(passwordValidation("S1234!s")); //PassWord is valid
    }


    public static String passwordValidation(String password) {

        if (password.length() < 6) {
            return "Password is too short";
        }


        int upperCount = 0;
        for (int i = 0; i < password.length(); i++) {

            if (Character.isUpperCase(password.charAt(i))) {
                upperCount++;
            }
        }
        if (upperCount == 0) {
            return "PassWord should at least contain one upper case letter";
        }


        int lowerCount = 0;
        for (int i = 0; i < password.length(); i++) {

            if (Character.isLowerCase(password.charAt(i))) {
                lowerCount++;
            }
        }
        if (lowerCount == 0) {
            return "PassWord should at least contain one lower case letter";
        }


        int specialCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i)) && !Character.isSpaceChar(password.charAt(i))) {
                specialCount++;
            }
        }
        if (specialCount == 0) {
            return "PassWord should at least contain one special characters";
        }

        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {

            if (!Character.isDigit(password.charAt(i))) {
                digitCount++;
            }
        }
        if (digitCount == 0) {
            System.out.println("Password should at least contain a digit");
        }

        return "PassWord is valid";

    }


}
