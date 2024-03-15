import java.util.Scanner;
import java.util.*;

public class Ques3 {   
    public static void main(String[] args){
        Scanner scn  = new Scanner(System.in); 
        System.out.println("Enter number 1 : ");
        int x = scn.nextInt();
        System.out.println("Enter number 2 : ");
        int y = scn.nextInt();

        System.out.println("Choose an Operation: ");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");

        System.out.println("Enter your Choice : ");
        int choice = scn.nextInt();

        switch (choice) {
            case 1:
                int sum = x+y;
                System.out.println("Addition of two number is: " +sum);
                break;
            case 2:
                int sub = x-y;
                System.out.println("Subtraction of  two number is: "+sub);
                break;
            case 3:
                int  mul = x*y;
                System.out.println("Product of two number is: " +mul);
                break;
            case 4:
                int div = x/y;
                if (y != 0){
                    System.out.println("Division  of two number is: " +div);
                }
                else{
                    System.out.println("Division by zero is not possible");
                }
                break;
            default:
                System.out.println("Enter your Choice between 1 to 4, Try Again ");
                break;
        }
    }
}
