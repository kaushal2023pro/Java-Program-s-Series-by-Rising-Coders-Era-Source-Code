// Rising Coders Era. Subscribe now!
// ProjectStore Website : https://risingcodersera.netlify.app


// Problem Statement-
// Create copy of array or temp array using for loop
                // 0 1 2 3 4 
// sourceArray =  {1,2,3,4,5}
                // 0 1 2 3 4 
// targetArray =  {1,2,3,4,5}

public class ArrayForLoop{
    public static void main(String[] args){
        // Initialize Source Array
        int []sourceArray = {1,2,3,4,5};

        // print Source array
        for(int i : sourceArray){
            System.out.print(i + " ");
        }System.out.println();

        // Initialize target Array
        int []targetArray = new int[sourceArray.length];

        // copy array using for loop
        for(int i=0; i<sourceArray.length; i++){
            targetArray[i] = sourceArray[i];

            // print target array
        for(int j : targetArray){
            System.out.print(j + " ");
        }System.out.println();
        }

        // print target array
        for(int i : targetArray){
            System.out.print(i + " ");
        }System.out.println();







        // 2nd code to copy 2,3,4 
        // please create seperate file for this.
        // {2,3,4}

        // Initialize Source Array
        // int []sourceArray = {1,2,3,4,5};

        // // print Source array
        // for(int i : sourceArray){
        //     System.out.print(i + " ");
        // }System.out.println();

        // // Initialize target Array
        // int []targetArray = new int[3];

        // // copy array using for loop
        // for(int i=0; i<3; i++){
        //     targetArray[i] = sourceArray[1+i];
        // // print target array
        // for(int j : targetArray){
        //     System.out.print(j + " ");
        // }System.out.println();
        // }
    }
}