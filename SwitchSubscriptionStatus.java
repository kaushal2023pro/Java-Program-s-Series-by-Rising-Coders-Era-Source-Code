
/*
Problem statement 1:
        Write a java program to handle user
        subscription statuses using a switch
        statement.

    Scanner: take input from user.
    Switch statement: Determine the output based on the subscription
                      status entered by the user.

    1. "subscribed": "You are subscribed. You will receive notifications."
    2. "not subscribed": "No notifications. Please subscribe to receive notifications."
    3. "trial": "You are on a trial. Subscribe soon to continue receiving notifications."
    4. "expired": "Your subscription has expired. Renew to receive notifications."
    5. "default": "Invalid input. Please enter a valid subscription status."
*/


import java.util.Scanner;

public class SwitchSubscriptionStatus {
    public static void main(String[] args) {

//        String alphabet = "j";

//        switch(alphabet){
//            case "h" -> System.out.println("Hen");
//            case "k" -> System.out.println("Kite");
//            case "l" -> System.out.println("Lion");
//            default -> System.out.println("Invalid input");
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your subscription status: subscribed, not subscribed, trial, expired");
        String status = scan.nextLine().toLowerCase();

        switch(status){
            case "subscribed":
                System.out.println("You are subscribed. You will receive notifications.");
                break;
            case "not subscribed":
                System.out.println("No notifications. Please subscribe to receive notifications.");
                break;
            case "trial":
                System.out.println("You are on a trial. Subscribe soon to continue receiving notifications.");
                break;
            case "expired":
                System.out.println("Your subscription has expired. Renew to receive notifications.");
                break;
            default:
                System.out.println("Invalid input. Please enter a valid subscription status.");
        }
        scan.close();
    }
}
