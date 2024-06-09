

public class J8_ReverseString{
    public static void main(String[] args){
        String s = "Rising";
        System.out.println("String Before " + s);

        // get the length of string
        int len = s.length();
        System.out.println(len);
        
        String rev = "";


        // here len-1 = 6-1 = 5.
        for(int i=len-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.println("String After: " + rev);

    }
}