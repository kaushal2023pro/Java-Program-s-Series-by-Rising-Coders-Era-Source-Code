/*
Diamond pattern
   *    i=1 sp=3  (n-i) st=1 (2*i)-1   
  ***   i=2 sp=2   4-2  st=3  2*2-1
 *****  i=3 sp=1        st=5
******* i=4 sp=0        st=7


 *****
  ***
   *
 */


public class Pattern6{
    public static void main(String[] args){
        int n=4;
        for(int i=1; i<=n-1; i++){
            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){
            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}