package com.mvr;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // int has a width of 32        4 bytes
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;                 // Literal
        int myValue = 10000;

        // byte has a width of 8        1 byte
        byte myByteValue = 10;          //-128 ~ 127

        // short has a width of 16      2 bytes
        short myShortvalue = (short) (myValue/2);       // Casting      // Expression

        // long has a width of 64 bits  8 Bytes
        long myLongValue = 100L;


        //  1. Create a byte variable and set it to any valid byte number.
        //  2. Create a short variable and set it to any valid short number.
        //  3. Create an int variable and set it to any valid int number.
        //  4. Create a variable of type long, and make it equal to
        //      50000 + 10 times the sum of the byte, plus the short plus the int.

        byte    byte_value  =   4;
        short   short_value =   22000;
        int     int_value   =   1_000_000;
        long    long_total;
        short   short_total;

        long_total = (50000+10L*(byte_value + short_value + int_value));
        short_total = (short) ((short)(50000)+(short)(10*(byte_value + short_value + (short)(int_value))));

        System.out.println("long_value = " + long_total);
        System.out.println("short_value = " + short_total);
        System.out.print(long_total);


    }
}
