// Source Code by `RISING CODERS ERA` 
// "Java Program Series" includes - 
// 1. Inteview Questions.
// 2. Core Java.
// 3. OOPs.
// 4. DSA.

// find out minimum & maximum no in array

public class ArrayMinMax{
    public static void main(String[] args){
        // Creating an array of numbers
        int[] numbers = {2000,400,5,300,200};
        
        // largest number
        int maxno = findLargestNumber(numbers);
        System.out.println("Largest number in array : " + maxno);

        // minimum number
        int minno = findSmallestNumber(numbers);
        System.out.println("Smallest number in array : " + minno);
    }


    public static int findLargestNumber(int[] arr){
        // validation
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array is empty or null");
        }

        // Assume first number as maximum
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int findSmallestNumber(int[] arr){
        // validation
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array is empty or null");
        }

        // Assume first number as minimum
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}