/*
 c 1 2 3
r1 * * *
r2 * * *
r3 * * *

*
*
*

*/

// star patterns, dsa sorting, 2d arrays
public class Pattern1{
    public static void main(String[] args){
        int n = 3;   
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// r1 * * *
// r2 * * *
// r3 * * *

