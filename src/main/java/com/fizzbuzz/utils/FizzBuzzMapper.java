package com.fizzbuzz.utils;

public class FizzBuzzMapper {
    private static final String STRING_VALUE_WHEN_MULTIPLE_OR_CONTAIN_3 = "Fizz";
    private static final String STRING_VALUE_WHEN_MULTIPLE_OR_CONTAIN_5 = "Buzz";
    private static final String STRING_VALUE_WHEN_MULTIPLE_OF_15 = "FizzBuzz";

    private FizzBuzzMapper (){
        //mask default constructor
    }

    public static String map(int number) {
        final String valueOfNumber = String.valueOf(number);
        if(number%15 == 0)
            return STRING_VALUE_WHEN_MULTIPLE_OF_15;
        if(number%3 == 0 || containsDigit(valueOfNumber,3))
            return STRING_VALUE_WHEN_MULTIPLE_OR_CONTAIN_3;
        if(number%5 == 0 || containsDigit(valueOfNumber,5))
            return STRING_VALUE_WHEN_MULTIPLE_OR_CONTAIN_5;
        return valueOfNumber;
    }

    private static boolean containsDigit(String number  , int digit){
        return number.contains(String.valueOf(digit));
    }
}
