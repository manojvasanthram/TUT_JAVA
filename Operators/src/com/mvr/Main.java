package com.mvr;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previous = result;

        result = result - 1;
        System.out.println(previous + " - 1 = " + result);

        previous = result;
        result = result * 2;
        System.out.println(previous + " * 2 = " + result);

        previous = result;
        result = result / 3;
        System.out.println(previous + " / 3 = " + result);

        //   ++ -- += -= *= /= > < >= <= == && || ?: works

        //   Bitwise operators works too ::  - & | ^ << >> >>>

        //  'if' is same as c++

        //  1.  Create a double variable with the value 20
        //  2.  Create a second variable of type double with the value 80
        //  3.  Add both numbers up and multiply by 25
        //  4.  Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        //  5.  Write an "if" statement that displays a message "Total was over the limit"
        //      if the remaining total (#4) is equal to 20 or less


        double d1 = 20d, d2 = 80d;
        double res;

        res = d1 + d2;

        res = res * 25;

        res = (res)%40;
        System.out.println(res);
        if (res <= 20)
            System.out.println("Total was over the limit");
    }
}
