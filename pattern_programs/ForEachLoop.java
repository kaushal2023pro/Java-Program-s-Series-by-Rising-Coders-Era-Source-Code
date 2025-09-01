

public class ForEachLoop{
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5};
        char[] characters = {'r','c','e'};
        String text = "Hello";

        for(int i=0; i<2; i++){
            System.out.print(characters[i] + " ");
        }System.out.println();

        for(int num : numbers){
            System.out.print(num + " ");
        }System.out.println();

        for(char chrac : characters){
            System.out.print(chrac + " ");
        }System.out.println();

        for(char ch : text.toCharArray()){
            System.out.print(ch + " ");
        }

    
        }

    
}