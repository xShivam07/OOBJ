import java.util.*;
class Ques6 {
    public  static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter the height of a Person in meter: ");
        double  ht = scn.nextDouble();
        System.out.print("Enter the weight of a Person in kilogram: ");
        double wt = scn.nextDouble();

        double sqht = ht * ht;
        double bmi =  (wt / sqht)*1000;

        if(bmi > 40){
            System.out.println("Obesity");
        }
        else if(bmi  >= 25 && bmi < 30){
            System.out.println("Overweight");
        }
        else if(bmi >= 18.5 && bmi < 25 ){
            System.out.println("Normal Weight");

        }
        else if(bmi < 18.5){
            System.out.println("Underweight");
        }
    }
}
