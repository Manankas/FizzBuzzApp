package com.fizzbuzz.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzMapperTest {

    @BeforeEach
    void setUp() {
    }

    @Test
     void shouldReturnOne(){
        String expected = "1";
        String actual = FizzBuzzMapper.map(1);
        assertEquals(expected, actual);
    }

    @Test
     void shouldReturnTwo(){
        String expected = "2";
        String actual = FizzBuzzMapper.map(2);
        assertEquals(expected, actual);
    }


    @Test
     void shouldReturnFizz(){
        String expected = "Fizz";
        String actual = FizzBuzzMapper.map(3);
        assertEquals(expected, actual);
    }

    @Test
     void shouldReturnBuzz(){
        String expected = "Buzz";
        String actual = FizzBuzzMapper.map(5);
        assertEquals(expected, actual);
    }

    @Test
     void shouldReturnFizzFor13(){
        String expected = "Fizz";
        String actual = FizzBuzzMapper.map(13);
        assertEquals(expected, actual);
    }

    @Test
     void shouldReturnFizzBuzz(){
        String expected = "FizzBuzz";
        String actual = FizzBuzzMapper.map(15);
        assertEquals(expected, actual);
    }

    @Test
     void shouldReturnBuzzFor25(){
        String expected = "Buzz";
        String actual = FizzBuzzMapper.map(25);
        assertEquals(expected, actual);
    }

    @Test
     void shouldReturnFizzBuzzFor30(){
        String expected = "FizzBuzz";
        String actual = FizzBuzzMapper.map(30);
        assertEquals(expected, actual);
    }
}