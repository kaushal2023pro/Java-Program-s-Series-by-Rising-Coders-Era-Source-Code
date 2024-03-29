/*
    In Java, "Math.min() & Math.max()" are static methods provided
    by the "Math" class to find the minimum & maximum numbers
    of two numbers, respectively.

    "Math.min(a,b)" => returns small value.
    "Math.max(a,b)" => returns large value. 

    These methods can accept different numeric types such as
    "int", "double", "float", etc, & they return the result as the 
    same types as the arguments passed to them.
*/

public class MinMax{
    public static void main(String[] args){
        // int 
        int a = 20;
        int b = 20;
        System.out.println("Minimum value : " + Math.min(a,b));
        System.out.println("Maximum value : " + Math.max(a,b));


        // float
        float float1 = 5.7f;
        float float2 = 7.2f;
        System.out.println("Minimum value : " + Math.min(float1,float2));
        System.out.println("Maximum value : " + Math.max(float1,float2));

        // double 
        double double1 = 10.5;
        double double2 = 8.3;
        System.out.println("Minimum value : " + Math.min(double1,double2));
        System.out.println("Maximum value : " + Math.max(double1,double2));
        
        
        
        // myfunction - Greatest number
        int greatest = Greatest(100,200);
        System.out.println("Greatest value : " + greatest);

        // myfunction - smallest number
        int smallest = Smallest(100,50,5);
        System.out.println("smallest value : " + smallest);
    }


// Greatest number 
public static int Greatest(int num1, int num2){
    if(num1 > num2){
        return num1;
    }
    else{
        return num2;
    }
}

// Smallest number
public static int Smallest(int num1, int num2, int num3){
    if(num1 < num2 && num1 < num3){
        return num1;
    }
    else if(num2 < num1 && num2 < num3){
        return num2;
    }
    else{
        return num3;
    }
}

}


