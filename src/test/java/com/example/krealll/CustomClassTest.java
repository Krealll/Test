package com.example.krealll;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomClassTest {

    @Test
    public void whenEmptyString_thenAccept() {
        CustomClass palindromeTester = new CustomClass();
        assertTrue(palindromeTester.isPalindrome(""));
    }

    @Test
    public void whenPalString_thenAccept() {
        CustomClass palindromeTester = new CustomClass();
        assertTrue(palindromeTester.isPalindrome("catac"));
    }

    @Test
    public void whenPalString_thenDecline() {
        CustomClass palindromeTester = new CustomClass();
        assertFalse(palindromeTester.isPalindrome("cat"));
    }

}