package com.mvr;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //  primitive types
        //  byte
        //  short
        //  int
        //  long
        //  float
        //  double
        //  char
        //  boolean

        //  Class
        //  string

        String myString  = " This is my string";

        System.out.println("myString is equal to " + myString);

        myString  = myString + ", and this is more.";

        System.out.println("myString is equal to " + myString);

        String numString = "250.34";

        numString = numString + "49.33";
        System.out.println(numString);
//        numString = (string)((float)(numString) + (float)("49.33"));
//        System.out.println(numString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;

        System.out.println(lastString);
        double mydouble = 125.44;

        lastString = lastString + mydouble;

        System.out.println(lastString);


    }
}
