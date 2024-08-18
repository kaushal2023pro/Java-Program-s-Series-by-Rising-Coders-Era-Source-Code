
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = (left + right) / 2;

            // check if target is present at mid
            if(arr[mid] == target){
                return  mid;
            }
            // if target greater, ignore left half
            if(arr[mid] < target){
                left = mid + 1;
            }
            // if target is smaller, ignore right half
            else{
                right = mid - 1;
            }

        }
        // target was not found
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 0;
        int result = binarySearch(arr,target);

        if(result != -1){
            System.out.println("Element " + target + " foundat index: " + result);
        }
        else{
            System.out.println("element not found");
        }

    }
}
