package com.teachmeskills.lesson9.task;

import com.teachmeskills.lesson9.myException.InvalidLoginException;
import com.teachmeskills.lesson9.myException.InvalidPasswordException;

import java.util.Arrays;

/**
 * The "DataValidationUsers" class contains a "verificationUserData" and "dataVerification" method
 *      that verifies the validity of the data entered by the user, returns "true" when executed,
 *      or throws an exception in case of an error
 *
 */
public class DataValidationUsers {

//data validation method using methods of the "String" class
    public static boolean dataVerification(String login, String password, String confirmPassword) throws InvalidLoginException, InvalidPasswordException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new InvalidLoginException("Login failed verification");
        }
        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\b.*") || !password.equals(confirmPassword)) {
            throw new InvalidPasswordException("Password failed verification");
        }
        return true;
    }




//method for verifying user data using the toCharArray() method
    public static boolean verificationUserData(String Login, String Password, String ConfirmPassword) throws InvalidLoginException, InvalidPasswordException{
        if (validationLogin(Login) && validationPassword(Password, ConfirmPassword)){
            return true;
        }
        return false;
    }

    public static boolean validationLogin(String Login) throws InvalidLoginException {
        char[] login = Login.toCharArray();

        if (login.length > 20){
            throw new InvalidLoginException("error: login length exceeded");
        }

        for (char c : login) {
            if (c == ' '){
                throw new InvalidLoginException("error: entered ' '");
            }
        }

        return true;
    }

    public static boolean validationPassword(String Password, String ConfirmPassword) throws InvalidPasswordException{
        char[] password = Password.toCharArray();
        char[] confirm_password = ConfirmPassword.toCharArray();
        int count = 0;

        for (char c : password) {
            if (c >= '0' && c <= '9') {
                count++;
            }
            else if (c == ' '){
                throw new InvalidPasswordException("error: entered ' '");
            }
        }
        if (count <= 0) {
            throw new InvalidPasswordException("error: there is no digit");
        }
        if (password.length > 20){
            throw new InvalidPasswordException("error: password length exceeded");
        }
        if (!Arrays.equals(password, confirm_password)){
            throw new InvalidPasswordException("error: passwords don't match");
        }
        return true;
    }

}
