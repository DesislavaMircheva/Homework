package lecture7;

import java.util.Scanner;

public class Lecture7Homework2 {
    //Направете програма BMI с която да изчислите вашият Body Mass Index.
    //Пренапишете тази програма като използвате Scanner (за тегло, височина) и IF –
    //ELSE IF – ELSE, и отпечатвайте в конзолата „Overweight”, „Normal Weight”,
    //„Underweight“
    public static void main(String[] args){

        float weight;
        float height;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your height:");
        height = Float.parseFloat(scan.next());
        System.out.println("Please enter your weight:");
        weight = Float.parseFloat(scan.next());

        float bmiIndex = (float) (weight/Math.pow(height,2));
        System.out.println(bmiIndex);

        if(bmiIndex<18.5) {
            System.out.print("Underweight");
        } else if (bmiIndex>24.9){
        System.out.print("Over weight");
        } else {
            System.out.println("Normal weight");
        }
    }
}
