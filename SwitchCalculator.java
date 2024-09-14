import java.util.Scanner;

/*
Problem statement 2 : Write a java program which performs basic operations.

    1. Prompt the user for 2 integers.
    2. Display a menu with options:
       1. Add 2. Subtract 3. Divide 4. Multiply
    3. Execute the corresponding operation based on user choice.
    4. Handle division by zero with an error message.
    5. Re-prompt the user for valid input if an invalid option is selected.
    6. End the program after a valid operation.

*/
public class SwitchCalculator{
    private static void displayMenu() {
        System.out.println("Select a choice: ");
        System.out.println("1. add");
        System.out.println("2. Subtract");
        System.out.println("3. Divide ");
        System.out.println("4. Multiply");
    }

    private static void add(int a, int b) {
        int result = a + b;
        System.out.println("Addition is: " + result);
    }

    private static void sub(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction is: " + result);
    }

    private static void div(int a, int b) {
        int result = a / b;
        if(b==0){
            System.out.println("Error: Division by 0 is undefined.");
        }
        else{
            System.out.println("Division is: " + result);
        }
    }

    private static void mul(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication is: " + result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter 1st number: ");
            int num1 = scan.nextInt();
            System.out.println("Enter 2nd number: ");
            int num2 = scan.nextInt();
            displayMenu();
            int choice = scan.nextInt();

            switch (choice){
                case 1:
                    add(num1,num2);
                    break;
                case 2:
                    sub(num1,num2);
                    break;
                case 3:
                    div(num1,num2);
                    break;
                case 4:
                    mul(num1,num2);
                    break;
                default:
                    System.out.println("Please select a valid choice: ");
                    continue;
            }
            break;
        }
        scan.close();
    }
}