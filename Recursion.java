/*
Source Code by `RISING CODERS ERA` Subscribe now! 
"Java Program Full Course YouTube" includes - 
1. Inteview Questions.
2. Core Java.
3. OOPs.
4. DSA.
// ProjectStore Website : https://risingcodersera.netlify.app
*/

public class Recursion{
    public static void printHi(int num){
        // base case
        if(num > 0){
            System.out.println("Hi");
            printHi(num-1);
        }
    }

    // factorial of a number.
    public static int factorial(int n){
        if(n == 0){   //base case factorial of 0 is 1.
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args){
        printHi(5);

        int result = factorial(5);
        System.out.println("factorial: " + result);
    }
}