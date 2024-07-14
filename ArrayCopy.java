public class ArrayCopy{
    public static void main(String[] args){
        // Create a array
        //                 //0 1 2 3 4
        // int srcArray[] = {1,2,3,4,5};

        // System.out.println("Original array: ");
        // for(int i : srcArray){
        //     System.out.print(i + " ");
        // }System.out.println();


        // // Create a variable to store the size of the array
        // int size = srcArray.length;  //5

        // // Create array where we will copy the above numbers
        // int[] destArray = new int[size];

        // // copy all elements from srcArray to destArray
        // System.arraycopy(srcArray,0,destArray,0,srcArray.length);


        // // display o/p
        // System.out.println("Copy array: ");
        // for(int i : destArray){
        //     System.out.print(i + " ");
        // }System.out.println();


                      // 0  1 2 3 4
        int srcArray[] = {1,2,3,4,5};

        // arr1[] = {1,2,3}
        // arr2[] = {4,5}

        int sizearr1 = 3;
        int sizearr2 = 2;

        int arr1[] = new int[sizearr1];
        int arr2[] = new int[sizearr2];

        System.arraycopy(srcArray,0,arr1,0,srcArray.length-2);
        System.arraycopy(srcArray,3,arr2,0,srcArray.length-3);

        System.out.println("Array1: ");
        for(int i : arr1){
            System.out.print(i + " ");
        }System.out.println();
        
        System.out.println("Array2: ");
        for(int i : arr2){
            System.out.print(i + " ");
        }System.out.println();


    }
}