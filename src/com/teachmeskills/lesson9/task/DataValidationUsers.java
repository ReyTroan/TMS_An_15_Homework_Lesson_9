package com.teachmeskills.lesson9.task;

import com.teachmeskills.lesson9.myException.InvalidLoginException;
import com.teachmeskills.lesson9.myException.InvalidPasswordException;

/**
 * The "DataValidationUsers" class contains a "dataVerification" method
 *      that verifies the validity of the user's entered data, returns "true" when executed,
 *      or throws an exception in case of an error
 */
public class DataValidationUsers {

    public static boolean dataVerification(String login, String password, String confirmPassword) throws InvalidLoginException, InvalidPasswordException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new InvalidLoginException("Login failed verification");
        }
        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\b.*") || !password.equals(confirmPassword)) {
            throw new InvalidPasswordException("Password failed verification");
        }
        return true;
    }

}
