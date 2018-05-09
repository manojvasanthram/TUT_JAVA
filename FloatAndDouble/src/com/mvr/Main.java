package com.mvr;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int     myIntValue      =   5;
        //  width of float  = 32 bits (4 bytes)     7 digits after the decimal point
        float   myFloatValue    =   5f;
        //  width of double = 64 bits (8 bytes)    16 digits after the decimal point
        double  myDoubleValue   =   5d;  // 5.25  - Taken as double by default, not as float

        System.out.println("myIntValue      =   "   +   myIntValue/2);
        System.out.println("myFloatValue    =   "   +   myFloatValue/3);        //
        System.out.println("myDoubleValue   =   "   +   myDoubleValue/3);

        //  Convert a given number of pounds to kilograms
        //  1.  Create a variable to store the number of pounds
        //  2.  Calculate the number of Kilograms for the number above and store in a variable.
        //  3.  Print out the result.
        //
        //  Notes:  1 pound is equal to 0.4539237 kilograms.
        double  pi      =   3.141_592_423;

        double  pounds  = 4.523;

        double  kilos   =   pounds * 0.4539237;

        System.out.println(pounds + "pounds is equal to " + kilos + "kilograms");
    }
}
