/*
Right-Angle Triangle
n=3

*        i=1 st=1
* *      i=2 st=2
* * *    i=3 st=3

*/

public class Pattern2{
    public static void main(String[] args){
        int n = 3;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// r1 *
// r2 * *
// r3 * * *


