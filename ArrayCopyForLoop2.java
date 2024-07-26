

/*
Problem statement 2
Divide given array in 2 parts

arr[] = {100,30,500,10,1,8,30}
int L[] = {100,30,500,10}
int R[] = {1,8,30}
*/

public class ArrayCopyForLoop2{
    public static void main(String[] args){
                   // 0  1   2  3  4 5 6 
        int arr[] = {100,30,500,10,1,8,30,40,50,30,260};

        int left = 0;
        int right = arr.length-1;

        int mid = (right-left)/2;

        System.out.println("mid: " + mid);

        // calculating index of newleftarray created
        int leftindex = mid - left + 1;

        // Create a new left array which will store 
        // the values of new created array.
        int Larray[] = new int[leftindex];

        for(int i=0; i<leftindex; i++){
            Larray[i] = arr[left + i];
        }
        for(int j : Larray){
            System.out.print(j + " ");
        }System.out.println();



         // calculating index of newrightarray created
        int rightindex = right-mid;

        // Create a new left array which will store 
        // the values of new created array.
        int Rarray[] = new int[rightindex];

        for(int i=0; i<rightindex; i++){
            Rarray[i] = arr[mid+1+i];
        }
        for(int j : Rarray){
            System.out.print(j + " ");
        }System.out.println();





    }
}