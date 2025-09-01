/*
Hollow Square Pattern

***** r1
*   * r2
*   * r3
***** r4
(row,column)
4,5
 */

public class Pattern7{
    public static void hollowPattern(int rows, int columns){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=columns; j++){
                if(i==1 || i==rows || j==1 || j==columns){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        hollowPattern(10,7);
    }
}