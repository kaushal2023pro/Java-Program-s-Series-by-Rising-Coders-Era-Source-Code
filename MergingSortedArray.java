
/*
Merging Sorted Array
L[] = {1,3,6,7}
R[] = {2,4,10,11}
arr[] = {}
*/

public class MergingSortedArray{
    public static void main(String[] args){
        int L[] = {1,3,6,7,7,7};
        int R[] = {2,4,10,11,13,50,60};

        int n1 = L.length;
        int n2 = R.length;

        int len = n1 + n2;

        int arr[] = new int[len];

        int i=0;
        int j=0;
        int k=0;

        while(i<n1 && j<n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any remains
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any remains
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }

        for(int m : arr){
            System.out.print(m + " ");
        }

    }
}