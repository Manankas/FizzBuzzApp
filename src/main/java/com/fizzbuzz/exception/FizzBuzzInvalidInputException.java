package com.fizzbuzz.exception;

public class FizzBuzzInvalidInputException  extends Exception{

    public FizzBuzzInvalidInputException(String errorMessage){
        super(errorMessage);
    }
}
