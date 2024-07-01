/*

{64, 34, 25, 12, 22}

{34,25,12,22,64}   64 sorted
  0  1  2  3  4

{25,12,22,34,64}   34 sorted 

{12,22,25,34,64}


Bubble Sort :- 
    DEF1 :
    simplest sorting algorithms used to sort a list of elements.
    It works by repeatedly stepping through the list, comparing adjacent elements,
    and swapping them if they are in the wrong order.
    This process is repeated until the list is sorted.

    DEF2 :
    Bubble Sort: This sorting technique is also known as exchange sort, which arranges 
    values by iterating over the list several times and in each iteration the larger value gets 
    bubble up to the end of the list. This algorithm uses multiple passes and in each pass the 
    first and second data items are compared. if the first data item is bigger than the second, 
    then the two items are swapped. Next the items in second and third position are compared 
    and if the first one is larger than the second, then they are swapped, otherwise no change in 
    their order. This process continues for each successive pair of data items until all items are 
    sorted.

    Step-by-Step Explanation:
1. Start at the beginning of the list: Compare the first two elements.
2. Swap if needed: If the first element is greater than the second element, swap them.
3. Move to the next pair: Compare the next two elements.
4. Repeat the process: Continue comparing and swapping adjacent elements until you reach the end of the list.
5. Pass through the list: After each pass through the list, the next largest element will be in its correct position.
6. Repeat the passes: Continue making passes through the list until no swaps are needed, indicating the list is sorted.
*/

public class P2_BubbleSort{

    // meethod to perform bubble sort
    public static void bubbleSort(int[] arr){
        int len = arr.length;
        int temp = 0;

        // Loop through all elements in the array
        for (int i = 0; i < len - 1; i++) {
            
            // Inner loop for each pass
            for (int j = 0; j < len - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap if they are in the wrong order
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    printArray(arr);
                }
            }
        }
    }


    // method to print the array
    public static void printArray(int[] arr){
        // using enhanced for loop
        for(int value : arr){
            System.out.print(value + " ");
        }
        System.out.println();
    }


    // main method to test the bubble sort
    public static void main(String[] args){
        int[] arr = {64, 34, 25, 12, 22};

        System.out.println("Original array: ");
        printArray(arr);
        System.out.println("--- --- --- ---");

        bubbleSort(arr);
        System.out.println("--- --- --- ---");
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}

