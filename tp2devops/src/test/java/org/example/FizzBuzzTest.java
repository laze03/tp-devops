package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public final void testAvecValeurUn() {
        String res = FizzBuzz.fizzBuzz(1);
        assertEquals("1",res,"Problem wiith number 1");
    }


    @Test
    public final void testAvecValeurDeux() {
        String res = FizzBuzz.fizzBuzz(2);
        assertEquals("2",res,"Problem wiith number 2");
    }

    @Test
    public final void testAvecValeurTrois() {
        String res = FizzBuzz.fizzBuzz(3);
        assertEquals("Fizz",res,"Problem wiith number 3");
    }

    @Test
    public final void testAvecValeurMultipleTrois() {
        String res = FizzBuzz.fizzBuzz(15);
        assertEquals("Fizz",res,"Problem wiith number 3");
    }
}