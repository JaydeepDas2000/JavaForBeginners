package com.codewithjaydeep;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Point point1 = new Point(x:1, y:1);
        Point point2 = point1;
        byte a= 1;
        byte b= a;
        a= 3;
        System.out.println("a : "+a+" b : "+b); // y not effected. completely different with each other
        point1.x = 2;
        System.out.println("point2 : "+point2); // point2 is dependent to point1
    }
}

/*
*   The differences between the primitive and reference types so we know that we use primitive types for
*   storing simple values and reference types for storing complex objects but there is a very important difference
*   between thse two categories of types in terms of memory management
* */