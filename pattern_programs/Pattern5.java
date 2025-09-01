/*
Inverted Pyramid Pattern
* * * *  st=4 i=0 sp=0 (n-i)
 * * *   st=3 i=1 sp=1 (4-1)
  * *    st=2 i=2 sp=2 (4-2)
   *     st=1 i=3 sp=3 (4-3)
n=4
*/

public class Pattern5{
    public static void main(String[] args){
       int n=3;
       for(int i=0; i<n; i++){
            // print spaces
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            // print stars
            for(int j=0; j<(n-i); j++){
                System.out.print("* ");
            }
            System.out.println();
       }
    }
}