package com.teachmeskills.lesson9.myException;

/**
 * The InvalidLoginException class represents a custom exception with two constructors,
 *      with a parameter and without a parameter, to describe a user data entry problem
 */
public class InvalidPasswordException extends Exception{

    private String codeVerificationError;

    public InvalidPasswordException(){
        super();
    }

    public InvalidPasswordException(String message){
        super(message);
        this.codeVerificationError = message;
    }

    // redefined method
    @Override
    public String toString() {
        return "InvalidPasswordException{" +
                "codeVerificationError='" + codeVerificationError + '\'' +
                '}';
    }
}
