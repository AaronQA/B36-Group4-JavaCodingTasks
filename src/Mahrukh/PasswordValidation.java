package Mahrukh;


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
        System.out.println(validPassword("Cydeo!1"));

        //System.out.println(validPassword("Cyd eo!1"));  //contains space
        //System.out.println(validPassword(null));
        //System.out.println(validPassword(" "));
    }

    public static boolean validPassword(String password){

        if (password == null){
            System.err.println("Password cannot be null");
            throw new IllegalArgumentException("A password cannot be null");
        }

        if (password.contains(" ")){
            System.err.println("Invalid Password");
            throw new IllegalArgumentException("A password cannot contain spaces");
        }

//        if (password.isBlank() || password.isEmpty()){
//            System.err.println("Password cannot be blank or empty");
//            throw new IllegalArgumentException("A password cannot be empty or blank");
//        }

        boolean hasAtLeast6Chars = password.length() >= 6;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < password.length(); i++) {
            char eachChar = password.charAt(i);

            if (Character.isUpperCase(eachChar)){
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

        if (isStrongPassword == true){
            System.out.println(password + " is a Strong & Valid Password");
            return isStrongPassword;
        }else {
            System.out.println(password + " is a Weak & Not Valid Password");
            return false;
        }

    }






}
