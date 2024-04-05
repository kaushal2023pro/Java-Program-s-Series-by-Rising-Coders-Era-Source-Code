/*
    write the java program to find out 
    days of the week by a given number
*/

import java.util.Scanner;

public class DaysOfWeek{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // prompt user for a no representing
        // the day of the week
        System.out.println("Enter a number(1 for sunday, 2 for monday, etc)");
        int dayNumber = scan.nextInt();
        
        
        // validate the input
        if(dayNumber < 1 || dayNumber > 7){
            System.out.println("Invalid Input, please enter a number b/w 1-7");
            return;
        }
       

        // Array to store names of days of week
        String[] daysofweek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        // calculate the index in the array
        // adjust for Zero-based indexing.
        int dayIndex = dayNumber - 1;
        System.out.println("day of week: " + daysofweek[dayIndex]);

    }
}