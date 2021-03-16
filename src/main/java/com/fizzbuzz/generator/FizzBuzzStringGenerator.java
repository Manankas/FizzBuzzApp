package com.fizzbuzz.generator;

import com.fizzbuzz.exception.FizzBuzzInvalidInputException;
import com.fizzbuzz.utils.FizzBuzzMapper;

import java.util.stream.IntStream;

public class FizzBuzzStringGenerator implements IFizzBuzzStringGenerator{

    @Override
    public String generate(int start , int end) throws FizzBuzzInvalidInputException {
        if(start >= end || start < 1 || start > 100 || end > 100){
            throw new FizzBuzzInvalidInputException("Start number must be less than end number and both between 1 and 100");
        }

        StringBuilder result = new StringBuilder();
        IntStream.rangeClosed(start, end)
                 .forEach(value -> result.append(FizzBuzzMapper.map(value)));

        return result.toString();
    }
}
