package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetScoreTest {
    @Test
    public void FizzBuzzNormalNumbers() {

        GetScore fb = new GetScore();
        Assertions.assertEquals("canada", fb.getSuperCupWinner(int [][] scores = ));
        Assertions.assertEquals("ussr", fb.getSuperCupWinner(2));
    }

    @Test
    public void FizzBuzzThreeNumbers() {

        FizzBuzzProcessor fb = new FizzBuzzProcessor();
        Assertions.assertEquals("Fizz", fb.convert(3));
    }

    @Test
    public void FizzBuzzFiveNumbers() {

        FizzBuzzProcessor fb = new FizzBuzzProcessor();
        Assertions.assertEquals("Buzz", fb.convert(5));
    }

    @Test
    public void FizzBuzzThreeAndFiveNumbers() {

        FizzBuzzProcessor fb = new FizzBuzzProcessor();
        Assertions.assertEquals("Buzz", fb.convert(5));
    }
}