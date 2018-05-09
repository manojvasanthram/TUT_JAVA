package com.mvr;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;                 // Literal
        int myValue = 10000;

        // byte has a width of 8
        byte myByteValue = 10;          //-128 ~ 127

        // short has a width of 16
        short myShortvalue = (short) (myValue/2);       // Casting      // Expression

        // long has a width of 64 bits  8 Bytes
        long myLongValue = 100L;
    }
}
