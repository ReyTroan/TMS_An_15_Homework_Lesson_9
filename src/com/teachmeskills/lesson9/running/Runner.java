package com.teachmeskills.lesson9.running;

import com.teachmeskills.lesson9.myException.InvalidLoginException;
import com.teachmeskills.lesson9.myException.InvalidPasswordException;
import com.teachmeskills.lesson9.task.DataValidationUsers;

/**
 * The main method contains a try/catch construct
 *     for possible handling of an exception thrown by the "dataVerification" method
 */
public class Runner {

    public static void main(String[] args) {
        try {
            if (DataValidationUsers.dataVerification("Andrey", "qwerty123", "qwerty123")){
                System.out.println("Verification passed successfully");
            }
        }catch (InvalidPasswordException | InvalidLoginException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
