//  find out if a number is positive or negative:

import java.util.*;

class IsPositive{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int myNum = scan.nextInt();
        

        if(myNum > 0){
            System.out.println("The given number is Positive");
        }

        else{
            System.out.println("The given number is negative");
        }
    }
}