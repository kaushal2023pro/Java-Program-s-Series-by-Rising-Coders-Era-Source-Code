
/*
Def1:
Insertion sort is a simple & intuitive comparison-based srting algorithm.
It works by dividing the list into a sorted & an unsorted region.
Elements from the unsorted region are picked & placed at the correct
position int the sorted region.

Def2:
Insertion sort is one of the best sorting techniques. It is twice as fast as Bubble sort.
In Insertion sort the elements comparisons are as less as compared to bubble sort. In this
comparison the value until all prior elements are less than the compared values is not
found. This means that all the previous values are lesser than compared value. Insertion
sort is a good choice for small values and for nearly sorted values.

*/

public class InsertionSort {

    // Method to perform insertion sort on an array
    public static void insertionSort(int[] arr) {
        int len = arr.length;
        
        // Loop through each element in the array starting from the second element
        for (int i = 1; i < len; i++) {
            int key = arr[i];  // The current element to be inserted
            int j = i - 1;     // The index of the previous element
            
            // Shift elements of arr[0..i-1] that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Place the key at its correct position
            arr[j + 1] = key;
            printArray(arr); // Print the array after each insertion
        }
    }

    // Method to print the elements of the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " "); // Print each element followed by a space
        }
        System.out.println(); // Print a new line after the array
    }

    // Main method to test the insertion sort
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6}; // Initialize an array to be sorted
        
        System.out.println("Array before sorting: ");
        printArray(arr); // Print the array before sorting
        
        System.out.println("Array after sorting: ");
        insertionSort(arr); // Sort the array using insertion sort
    }
}

/*
# Explanation of Java Code:

1. Method Declaration:
   - public static void insertionSort(int[] array): 
   This method takes an array of integers and sorts it in place using the insertion sort algorithm.

2. Outer Loop:
   - for (int i = 1; i < len; i++): Starts from the second element (index 1) and iterates through the array.

3. Key Element:
   - int key = array[i]: The current element to be inserted into the sorted part of the array.

4. Inner Loop:
   - while (j >= 0 && array[j] > key): Compares the key with elements in the sorted part of the array,
   moving elements that are greater than the key one position to the right.

5. Insert the Key:
   - array[j + 1] = key: Inserts the key element into its correct position in the sorted part of the array.

6. Main Method:
   - Initializes an array, calls the insertionSort method, and prints the sorted array.
*/

