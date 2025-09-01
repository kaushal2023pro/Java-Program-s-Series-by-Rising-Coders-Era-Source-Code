/*
Pyramid Pattern
   *     i=0 sp=3 n-i-1 st=1 i+1
  * *    i=1 sp=2 4-1-1 st=2 1+1
 * * *   i=2 sp=1 4-2-1 st=3 2+1
* * * *  i=3 sp=0 4-3-1 st=4 3+1
n=4
*/

public class Pattern4{
    public static void main(String[] args){
        int n = 3;
        for(int i=0; i<n; i++){
            // print spaces
            for(int j=0; j<(n-i-1); j++){
                System.out.print(" ");
            }

            // print stars
            for(int j=1; j<=(i+1); j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}