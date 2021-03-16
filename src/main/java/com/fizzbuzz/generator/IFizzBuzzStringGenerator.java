package com.fizzbuzz.generator;

import com.fizzbuzz.exception.FizzBuzzInvalidInputException;

public interface IFizzBuzzStringGenerator {
     String generate(int start , int end) throws FizzBuzzInvalidInputException;
}
