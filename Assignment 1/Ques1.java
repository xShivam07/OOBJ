import java.util.Scanner;

class Ques1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter numerical Grade between 1 to 5: ");
        int numGrade = scn.nextInt();

        if(numGrade > 4){
            System.out.println("Grade A");
        }
        else if(numGrade > 3){
            System.out.println("Grade B");
        }
        else if(numGrade > 2){
            System.out.println("Grade C");
        }
        else if(numGrade > 1){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }  
    }
}
