package lecture7;

import java.util.Scanner;
//Напишете програма, която прочита число от конзолата и отпечатва дали то е
//четно или нечетно. (Подсказка: използвайте оператора „?:”)
//Използвайте IF – ELSE вместо „?:“
//Напишете програма, която чете числото от конзолата и отпечатва дали е четно или нечетно.

public class Lecture7Homework3 {
    public static void main(String [] args) {

        int myNum;
        System.out.println("Enter a number:");
        Scanner scan = new Scanner(System.in);
        myNum = scan.nextInt();

        System.out.println("Is this number even?");
        if ((myNum % 2) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
