/* 
Source Code by `RISING CODERS ERA` 
"Java Program Series" includes - 
1. Inteview Questions.
2. Core Java.
3. OOPs.
4. DSA.

Program 1 : Java program to print an integer, string
(Entered by the user).

    you should have the below knowledge
    -> Hello World Program.
    -> Basic Input & Output.
*/

import java.util.Scanner;

public class Jpro1 {
    public static void main(String[] args) {
        // Create a scan instance which takes
        // input from standard input - keyboard
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");

        // nextInt() reads the next integer from 
        // the keyboard.
        int number = scan.nextInt();
        System.out.println("Your entered: " + number);

        // Java program to print string.
        System.out.println("Enter your name: ");
        String name = scan.next();
        System.out.println("Your name is: " + name);

        // java program to print "hello world".
        System.out.println("Hello world");

        // closing scan
        scan.close();
    }
}

/*
    * EXPLANATION of `Pogram to print an integer` - 
    -> Object of scanner class, scan created to take inputs
    from standard input, which is keyboard.
    -> "Enter a number" prompt is printed.
    -> `scan.nextInt()` reads all entered integers from 
    the keyboard unless it encounters a new line character.
    \n (Enter). 
    The entered integers are then saved to the integer 
    variable number.
    -> if you entered any character which is not an integer,
    the compiler will through an `InputMismatchException`.
    -> finally, number is printed onto the standard output 
    (System.out) computer screen using the function 
    println().
*/

