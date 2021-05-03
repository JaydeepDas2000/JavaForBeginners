package com.codewithjaydeep;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // for Primitive type
        byte age = 30;
        int subscibe = 3_25_300; //for better known use write like that 3,23,000 but in java we can use 3_23_000
        long viewsCount = 3_123_456_789L;
        float price = 1000.99F;
        double priceLargeBox = 50_000.67;
        char letter = 'A';
        boolean isEligible = false;
        // for Reference
        Date now = new Date();
        System.out.println(age+" "+subscibe+" "+viewsCount+" "+price+" "+priceLargeBox+" "+letter+" "+isEligible);
        System.out.println(now);
    }
}
/*
* Data type have two type - Primitive and Reference
*
*   =========Primitive===========
*
*   Type    |   Bytes   |   Range
* -------------------------------------
*   Byte    |   1       |   [-128,127]
*   short   |   2       |   [-32K,32K]          ## this is all for storing whole number
*   int     |   4       |   [-2B,2B]
*   long    |   8       |
* -------------------------------------
*   float   |   4       |                       ## this is for storing decimal number
*   double  |   8       |
* -------------------------------------
*   char    |   2       |   A,B,C...            ## this is for character
* -------------------------------------
*   boolean |   1       |   true/false          ## this is for bollean value
*
*
* ============Reference=============
*   the `new` operator to allocate memory for this variable and this is one of the
*   difference between the primitive and reference types
*
*   when declaring primitive types we don't need to allocate memory memory is allocated
*   and released by Java Runtime enviroment but when dealing with reference type we should always
*   allocate memory now we don't have to release this memory Java Runtime enviroment will automatically take
*   care
* */
