/*
Hollow Pyramid Pattern
    *     i=1 sp=4 st=1 (2*i-1)
   * *    i=2 sp=3 st=3 2*2-1
  *   *   i=3 sp=2 st=5 
 *     *  i=4 sp=1 st=7
********* i=5 sp=0 st=9
 */
public class Pattern9{
    public static void main(String[] args){
        int rows =10;
        for(int i=1; i<=rows; i++){
            // print spaces
            for(int j=i; j<rows; j++){
                System.out.print(" ");
            }

            // print stars & spaces in between
            for(int k=1; k<=(2*i-1); k++){
                if(k==1 || k==(2*i-1) || i==rows){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}