/* Selection sort
    defination 1 :
    "simple comparison-based sorting algorithm. It
    works by repeatedly finding the minimum element 
    (for ascending order) from the unsorted part of the
    array and putting it at the beginning."

    defination 2 :
    "the smallest value among the unsorted elements of the array is 
    selected in every pass and inserted to its appropriate position into the array. First, find the 
    smallest element of the array and place it on the first position. Then, find the second 
    smallest element of the array and place it on the second position. The process continues 
    until we get the sorted array. The array with n elements is sorted by using n-1 pass of 
    selection sort algorithm."

*/

public class P1_SelectionSort{
    // Function to perform selection sort
    public static void selectionSort(int[] arr){
        int n = arr.length;
        System.out.println("Array length : " + n);

        // One by one move boundary of unsorted subarray
        for(int i=0; i<n-1; i++){
            // Find the minimum element in unsorted array
            int minIndx = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndx]){
                    minIndx = j;
                }
            }
            
            // Swap the found minimum element with the first element
            int temp = arr[minIndx];
            arr[minIndx] = arr[i];
            arr[i] = temp;
            printArray(arr);
        }
    }

    // Function to print the array
    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // using enhanced loop
        // for(int n : arr){
        //     System.out.println(n);
        // }
    }

    // Main method to test the selection sort
    public static void main(String[] args){
        int[] arr = {64,25,12,22,11};
        System.out.println("Original array: ");
        printArray(arr);
        
        selectionSort(arr);
        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}  




/*
Explanation of the Code

1. selectionSort Method:

- The outer loop iterates over each element of the array except the last one.

- minIdx is initialized to the current index i.

- The inner loop finds the index of the minimum element in the unsorted part of the array.

- After finding the minimum element, it swaps it with the element at index i.
 
 
2. printArray Method:

This method simply prints all elements of the array.


3. main Method:

- An example array is defined and printed.

- The selectionSort method is called to sort the array.

- The sorted array is printed.

This is a basic implementation of the selection sort algorithm in Java. It sorts the array in-place, meaning it does not require any additional storage. However, its time complexity is 
𝑂(𝑛^2), making it inefficient for large datasets compared to more advanced algorithms like quicksort or mergesort.
*/