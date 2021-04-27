package com.example.krealll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CustomClassTest {

    private CustomClass customClass;
    private  int one;
    private  int two;
    private  int five;
    private int four;

    @BeforeEach
    void setUp() {
        customClass = new CustomClass();
        one=1;
        two=2;
        five=5;
        four=4;
    }

    @Test
    void isMoreThanThreePositive() {
        Assertions.assertTrue(customClass.isMoreThanThree(five));
    }

    @Test
    void isMoreThanThreePositiveTwo() {
        Assertions.assertTrue(customClass.isMoreThanThree(four));
    }

    @Test
    void isMoreThanThreeNegative() {
        Assertions.assertFalse(customClass.isMoreThanThree(one));
    }

    @Test
    void isMoreThanThreeNegativeTwo() {
        Assertions.assertFalse(customClass.isMoreThanThree(two));
    }
}