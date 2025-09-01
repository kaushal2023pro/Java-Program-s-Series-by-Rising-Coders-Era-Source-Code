/*
Half Pyramid Pattern
1            i=1  
1 2          i=2
1 2 3        i=3
1 2 3 4      i=4
1 2 3 4 5    i=5   

1 
2 3
4 5 6
7 8 9 10       
11 12 13 14 15 
*/

public class Pattern11{
    public static void main(String[] args){
        int rows=5;
        int num = 1;
        for(int i=1; i<=rows; i++){
            for(int j=0; j<i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}