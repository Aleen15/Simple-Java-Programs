import java.util.*;

class AverageAge{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Total no.of ages list:");
        int n = scan.nextInt();

        int[] ages = new int[n];
        System.out.println("Enter the list of ages:");

        for(int i=0; i<n; i++){
            ages[i] = scan.nextInt();
        }

        float avg = 0;
        float sum = 0;

        for(int age : ages){
            sum +=age;
        }

        avg = sum/n;

        System.out.println("The Average of the Ages is: "+avg);
    }
}