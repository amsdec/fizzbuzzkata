package com.github.amsdec;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    void convert() {
        assertEquals("1", this.fizzBuzz.convert(1));
        assertEquals("2", this.fizzBuzz.convert(2));
        assertEquals("Fizz", this.fizzBuzz.convert(3));
        assertEquals("Buzz", this.fizzBuzz.convert(5));
        assertEquals("Fizz", this.fizzBuzz.convert(6));
        assertEquals("Buzz", this.fizzBuzz.convert(10));
        assertEquals("FizzBuzz", this.fizzBuzz.convert(15));
    }

}
