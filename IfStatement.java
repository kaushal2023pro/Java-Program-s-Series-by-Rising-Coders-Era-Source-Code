

/*
checking if coffee shop is eligible for a discount
1. purchaseAmount >= 50           -> Discount for 10%
2. isStudent                      -> Discount for 10%
3. no discount
*/
public class IfStatement {
    public static void main(String[] args) {
//        Grade calculation based on marks
//        marks >= 90  -> A
//        marks >= 80  -> B
//        marks >= 70  -> C
//        marks >= 60  -> D
//        else         -> F

        int marks = 59;

        if(marks >= 90){
            System.out.println("Grade: A");
        }

        else if(marks >= 80){
            System.out.println("Grade: B");
        }

        else if(marks >= 70){
            System.out.println("Grade: C");
        }

        else if(marks >= 60){
            System.out.println("Grade: D");
        }

        else{
            System.out.println("Grade: F");
        }




//        int purchaseAmount = 100;
//        boolean isStudent = false;
//
//        if(purchaseAmount >= 50 && isStudent){
//            System.out.println("Discount for 10%");
//        }
//
//        else{
//            System.out.println("No discount");
//        }




//        int a = -100;
//        if(a > 0){
//            System.out.println("positive no");
//        }
//
//        else if(a == 0){
//            System.out.println("The number is zero");
//        }
//
//        else{
//            System.out.println("negative number");
//        }
    }
}
