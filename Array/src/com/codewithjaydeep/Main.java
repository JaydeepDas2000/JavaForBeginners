package com.codewithjaydeep;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[5]; // array is a reference type
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers); // by default when we print an array java return the string which is calculated
        // based on the address of this object in memory
        System.out.println(Arrays.toString(numbers));

        // --Another way to initialize an array--
        int[] marks = {85, 80, 60, 70, 95, 99};
        System.out.println(marks.length); // it will help size of an array
        Arrays.sort(marks); // it help to sort item inside an array
        System.out.println(Arrays.toString(marks));
    }
}
/*
*       --Array--
*   We use array to store list of items like a list of numbers or a list of people or a list of message
* */