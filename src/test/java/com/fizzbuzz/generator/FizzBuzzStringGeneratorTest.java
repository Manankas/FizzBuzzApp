package com.fizzbuzz.generator;

import com.fizzbuzz.exception.FizzBuzzInvalidInputException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FizzBuzzStringGeneratorTest {

    IFizzBuzzStringGenerator generator;

    @BeforeEach
    void setUp() {
        generator = new FizzBuzzStringGenerator();
    }

    @Test
    void shouldThrowExceptionForEndGreaterThanStart() {
        assertThrows(FizzBuzzInvalidInputException.class , () -> generator.generate(5,1));
    }

    @Test
    void shouldThrowExceptionForNumberNotIn1To100() {
        assertThrows(FizzBuzzInvalidInputException.class , () -> generator.generate(5,500));
    }

    @Test
    void shouldThrowExceptionForNegatifNumberNotIn1To100() {
        assertThrows(FizzBuzzInvalidInputException.class , () -> generator.generate(-1,1));
    }

    @Test
    void shouldReturn12Fizz4BuzzFor1To5() throws FizzBuzzInvalidInputException{
        String expected = "12Fizz4Buzz";
        String actual = generator.generate(1,5);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn12Fizz4BuzzFizz78FizzBuzz11FizzFizz14FizzBuzzFor1To15() throws FizzBuzzInvalidInputException{
        String expected = "12Fizz4BuzzFizz78FizzBuzz11FizzFizz14FizzBuzz";
        String actual = generator.generate(1,15);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn9798FizzBuzzFor97To100() throws FizzBuzzInvalidInputException{
        String expected = "9798FizzBuzz";
        String actual = generator.generate(97,100);
        assertEquals(expected, actual);
    }

}