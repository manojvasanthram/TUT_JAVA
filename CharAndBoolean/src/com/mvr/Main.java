package com.mvr;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //  width of char is 16 bits (2 bytes)
        char myChar = '5';
        char unicode = '\u00A9';

        //  width of boolean is 1 bit
        boolean myBool = true;

        System.out.println(myChar);
        System.out.println(unicode);
        System.out.println((int)unicode);
        System.out.println(myBool);

        char    temp = '\u00A0';

        for (int i = 0; i < 16; i++) {
            unicode = (char)((int) (temp + i));
            //temp = temp + (char) '9';
            System.out.println((int)(unicode) + " " + unicode);
        }

    }
}
