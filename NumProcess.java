// processing a list of numbers where you want to skip negative values, but stop completely if you find a zero

import java.util.*;

class NumProcess{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total no.of numbers:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the list of numbers");
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        for(int num : arr){
            if(num < 0){
                continue;
            }
            if(num == 0){
                break;
            }
            System.out.println(num);
        }
       
    }
}