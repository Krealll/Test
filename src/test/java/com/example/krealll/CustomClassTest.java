package com.example.krealll;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomClassTest {

    private CustomClass customClass;
    private  int one;
    private  int two;
    private  int five;
    private int four;
    private int six;

    @BeforeClass
    void setUp() {
        customClass = new CustomClass();
        one=1;
        two=2;
        five=5;
        six=6;
        four=4;
    }

    @Test
    void isMoreThanThreePositiveTest() {
        assertTrue(customClass.isMoreThanThree(five));
    }

    @Test
    void isMoreThanThreePositiveTwoTest() {
        assertTrue(customClass.isMoreThanThree(four));
    }

    @Test
    void isMoreThanThreePositiveThreeTest() {
        assertTrue(customClass.isMoreThanThree(six));
    }

    @Test
    void isMoreThanThreeNegativeTest() {
        assertFalse(customClass.isMoreThanThree(one));
    }

    @Test
    void isMoreThanThreeNegativeTwoTest() {
        assertFalse(customClass.isMoreThanThree(two));
    }

}