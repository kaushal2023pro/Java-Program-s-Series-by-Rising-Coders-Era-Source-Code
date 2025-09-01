/*
Hourglass Pattern
********* i=0   sp=0  9 2*(n-i)-2
 *     *  i=1   sp=1  7 2*(5-1)-2
  *   *   i=2   sp=2  5 
   * *    i=3   sp=3  3
    *     i=4   sp=4  1 
   * *    i=1   sp=3 3 j<2*i+1 = 3
  *   *   i=2   sp=2 5
 *     *  i=3   sp=1 7
********* i=4   sp=0 9
 */
public class Pattern10{
    public static void main(String[] args){
        int n=5;

        // upper part
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }

            // print stars & space
            for(int j=0; j<2*(n-i)-1; j++){
                if(j==0 || i==0 || j==2*(n-i)-2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //bottom part
        for(int i=1; i<n; i++){
            //spaces
            for(int j=1; j<(n-i-1+1); j++){
                System.out.print(" ");
            }

            // print spaces & Star
            for(int j=0; j<2*i+1; j++){
                if(j==0 || i==n-1 || j==2*i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}