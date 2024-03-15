
import java.util.Scanner;
class Ques2 {
    public static void main(String[] args){
        Scanner scn  = new Scanner(System.in);
        System.out.println("Search Year : " );
        int year = scn.nextInt();

        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ){
            System.out.println(year + " is a Leap Year");
        }
        else{
            System.out.println(year + " is not a Leap Year");
        }
    }
}
