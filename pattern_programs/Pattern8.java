/*
Hollow Triangle Pattern
*     r1 c1
**    r2 c2
* *   r3 c3
****  r4 c4
 */
public class Pattern8{
    public static void main(String[] args){
        int n=10;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(j==1 || j==i || i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}