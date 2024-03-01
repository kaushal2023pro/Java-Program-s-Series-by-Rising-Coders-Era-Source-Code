/* 
Source Code by `RISING CODERS ERA` 
"Java Program Series" includes - 
1. Inteview Questions.
2. Core Java.
3. OOPs.
4. DSA.

Program 2 : Types of Java Operators-

        1. Arithmetic Operators.
        2. Assignment Operators.
        3. Comparison Operators.
        4. Logical Operators.
        5. Increment & Decrement Operators.
        6. Conditional (Ternary) Operator.
*/

public class Jpro2 {
    public static void main(String[] args) {
        /*
        1. Arithmetic Operators: "Used to perform arithmetic 
        operations like add, substract, multiply, division
        & modulus."
        */
        int a = 10;
        int b = 5;
        // addition
        int sum = a + b;

        // substract
        int difference = a - b;
        
        // Multiply
        int product = a * b;

        // Division
        int quotient = a / b;

        // Modulus
        int remainder = a % b;

        System.out.println("1. Arithmetic Operators - ");
        System.out.println("sum " + sum);
        System.out.println("difference " + difference);
        System.out.println("product " + product);
        System.out.println("quotient " + quotient);
        System.out.println("remainder " + remainder);
        System.out.println();


        /*
        2. Assignment Operators: "Used to assign 
        values to variables"
        */
        
        int x = 10;
        // Equivalent to: x = x + 5
        x += 5;
        System.out.println("2. Assignment Operators -");
        System.out.println("x = x + 5 "+ x);
        
        int y = 10;
        // Equivalent to: y = y - 5
        y -= 5;
        System.out.println("y = y - 5 " + y);
        System.out.println();
        

        // 3. Comparison Operators: "used to compare 2 values"
       
        int num1 = 10;
        int num2 = 20;

        // Equal to
        boolean isEqual = (num1 == num2);
        System.out.println("3. Comparison Operators -");
        System.out.println("num1 + num2 " + isEqual);

        // Not equal to 
        boolean isNotEqual = (num1 != num2);
        System.out.println("num1 != num2 " + isNotEqual);

        // Greater than
        boolean isGreaterThan = (num1 > num2);
        System.out.println("num1 > num2 " + isGreaterThan);

        // Less than
        boolean isLessThan = (num1 < num2);
        System.out.println("num1 < num2 " + isLessThan);
        System.out.println();

        // 4. Logical Operators: "Used to perform
        // logical operations"
        boolean Q = true;
        boolean W = false;        

        // logical AND
        // when `both true` then true.
        boolean result = (Q && W);
        System.out.println("4. Logical Operators -");
        System.out.println(result);

        // logical OR
        // when `both false` then false.
        boolean result2 = (Q || W);
        System.out.println(result2);

        // logical NOT
        boolean result3 = (!Q);
        System.out.println(result3);
        System.out.println();

        // 5. Increment & Decrement Operators: "Used to 
        // increment or decrement the values of a variable"
        int count  = 10;
        // increment by 1
        count ++;
        System.out.println("5. Increment & Decrement Operators -");
        System.out.println(count);
        
        // decrement by 1
        count --;
        System.out.println(count);
        System.out.println();

        // 6. Conditional (Ternary) Operator: "Used to assign a
        // value based on condition."
        System.out.println("6. Conditional (Ternary) Operator -");
        int age = 21;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println(status);
        System.out.println();
    }
}
