package com.teachmeskills.lesson9.myException;

/**
 * The InvalidLoginException class represents a custom exception with two constructors,
 *      with a parameter and without a parameter, to describe a user data entry problem
 */
public class InvalidLoginException extends Exception{

    private String codeVerificationError;

    public InvalidLoginException(){
        super();
    }
    public InvalidLoginException(String message){
        super(message);
        this.codeVerificationError = message;
    }

    // redefined method
    @Override
    public String toString() {
        return "InvalidLoginException{" +
                "codeVerificationError='" + codeVerificationError + '\'' +
                '}';
    }
}
