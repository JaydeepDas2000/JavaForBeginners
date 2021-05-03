package com.codewithjaydeep;

public class Main {

    public static void main(String[] args) {
	    String message = new String("Hello World");
	    String message_alter = "Hello World";  // this is the shorthand to initialize string
        // although variable strings are reference types in java but because we use them often
        // there is a short way to create them..
        System.out.println(message);
        System.out.println(message_alter);
        // for concatenate we use + symbol
        System.out.println("Jaydeep "+"Das");
        // string is a class it has members that we can access using the dot operator
        System.out.println(message.endsWith("World"));  // It will check string `World` is present in last
        System.out.println(message.startsWith("World")); // It will check string `World` is present in start
        System.out.println(message.length()); // It will check that what is the length of string message
        System.out.println(message.indexOf("o")); // It will check the index of that char. like here o = 4
        System.out.println(message.indexOf("J")); // If it is not present then it will show -1
        System.out.println(message.replace("l","L")); // It will help to replace char/string to another char/string
        // Java strings are immutable
        System.out.println(message.toLowerCase()); // It will convert whole string to lower case
        System.out.println(message.toUpperCase()); // It will convert whole string to upper case
    }
}
