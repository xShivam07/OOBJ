import java.util.Scanner;

class Ques5 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Character: ");
        char  ch = scn.next().charAt(0);

        if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("It's a vowel ");
        }
        else{
            System.out.println("It's a consonant ");
        }
    } 
}
