import java.util.*;
class DoorCode{

    public static void main(String[] args){
        int doorCode = 1510;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter door code:");
        int userCode = scan.nextInt();

        //if the user typed code is correct the door will open
        if(userCode == doorCode){
            System.out.println("Correct code... The door is now Open...!");
        }
        else{
            System.out.println("Wrong Code...:( Try Again");
        }
    }
}