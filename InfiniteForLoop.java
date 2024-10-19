

public class InfiniteForLoop {
    public static void main(String[] args){
        // for(start; end; increment/decrement)
        int i = 1;
        for(;;){
            System.out.println(i);
            i++;
            if(i==11){
                break;
            }
        }
    }
}
