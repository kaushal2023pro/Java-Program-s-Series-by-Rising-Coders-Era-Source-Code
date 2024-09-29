
/*
for loop:
    " allows you to execute a block of code
    repeatedly for a specific number of iterations "
*/
public class ForLoop {
    public static void main(String[] args) {
        //for(start; end; i++/i--){}

        // print no 1-5
        int length = 5;
        for(int i=1; i<=length; i++){
            System.out.println(i);
        }

        // print no 5-1
        for(int j=5; j>=1; j--){
            System.out.println(j);
        }
    }
}
