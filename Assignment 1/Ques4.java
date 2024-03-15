import java.util.Scanner;
import java.util.*;

public class Ques4 {   
    public static void main(String[] args){
        Scanner scn  = new Scanner(System.in);

        System.out.println("Enter day number : ");
        int choice = scn.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thrusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter your Choice between 1 to 7, Try Again ");
                break;
        }
    }
}
