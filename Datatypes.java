/*
Pro3 : Datatypes in java?

1. Primitive Data Types
2. Non-Primitive/Reference Data Types.


# Primitive Data Types

`primitive data types / Reference Data Types` ->
-> Predefined by language.
In Java, primitive data types are predefined by the language and 
are named by reserved keywords. They do not share state with other 
primitive values. The eight primitive data types in Java are:

One byte is equal to 8 bits.In most computer 
systems, a byte is the basic unit of data storage 
and consists of 8 bits. Each bit can represent 
a binary value of either 0 or 1, giving a total 
of "2^8 = 256" possible combinations for a single byte.

1byte = 8bits. 
1. byte : 1 byte = 8 bits.
2. short : 2 bytes = 16 bits.
3. int : 4 bytes = 32 bits.
4. long : 8 bytes = 64 bits.
5. float : 4 bytes = 32 bits.
6. double : 8 bytes = 64 bits.
7. char : 2 bytes = 16 bits
8. boolean : 1 bit. 


`Non-primitive data types` -> 
    "Non-primitive data types in Java, also known as 
    reference types, are created by the programmer and
    are not predefined by Java, except for String.
    These data types refer to objects and offer versatility 
    beyond simple values. Examples of non-primitive data 
    types in Java include Strings, Arrays, Classes, and Interfaces. 
    Non-primitive types can be used to call methods to perform 
    operations, can be null, and start with an uppercase letter. 
    They facilitate the creation of complex data structures and 
    are crucial for effective Java programming"

*/


public class Datatypes {
    public static void main(String[] args) {

        // Primitive Datatype in Java.

        // Represents a small integer value from (-128 t0 127).
        byte myByte = 10;
        System.out.println(myByte);

        // Represents a short integer value from (-32,768 t0 32,767).
        short myShort = 100;
        System.out.println(myShort);

        // Represents an integer value from (-2^31 t0 2^31-1).
        // -2^31 = -2,147,483,648 , 2^31-1 = 2147483647
        int myInt = 1000;
        System.out.println(myInt);

        // Represents an long integer value from (-2^63 t0 -2^63-1).
        // -2^63 = -9223372036854775808L , 2^63-1 = 9,223,372,036,854,775,807.
        long myLong = 1000000L;
        System.out.println(myLong);

        // Represents a floating-point value from with single precision.
        float myFloat = 3.14f;
        System.out.println(myFloat);

        // Represents a floating-point value from with double precision.
        double myDouble = 3.14159;
        System.out.println(myDouble);

        // Represents a single Unicode character 
        char myChar = 'A';
        System.out.println(myChar);

        // Represents a boolean value true or false
        boolean myBoolean = true;
        System.out.println(myBoolean);

        // Represents an integer value as an object
        Integer myIntegerObject = 42;
        System.out.println(myIntegerObject);

    }
}

