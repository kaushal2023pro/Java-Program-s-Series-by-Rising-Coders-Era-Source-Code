/*
Inverted Right-Angled Triangle
n=4
* * * * i=1 st=4 (n-i+1)
* * *   i=2 st=3 (4-2+1)
* *     i=3 st=2 (4-3+1)
*       i=4 st=1 (4-4+1)

* * * * i=0 st=4 (n-i)
* * *   i=1 st=3 (4-1)
* *     i=2 st=2 (4-2)
*       i=3 st=1 (4-3)

*/

public class Pattern3{
    public static void main(String[] args){
        int n=3;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


/*
i=3
j=1
r1 * * *  
r2 * *
r3 *
*/