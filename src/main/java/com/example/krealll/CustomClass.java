package com.example.krealll;

import java.util.Arrays;

public class CustomClass {

    public boolean isPalindrome(String inputString) {
        if (inputString.length() == 0) {
            return true;
        } else {
            String rev = "";
            int length = inputString.length();

            for ( int i = length - 1; i >= 0; i-- )
                rev = rev + inputString.charAt(i);

            if (inputString.equals(rev))
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Params:");
        System.out.println(Arrays.toString(args));
    }

//Test
//Test
//Test

}
