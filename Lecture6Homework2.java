package leture6;

import java.util.Scanner;

public class Lecture6Homework2 {
    public static void main(String[] args){
        //Напишете програма, която чете числото от конзолата и отпечатва дали е четно или нечетно.

        int myNum;
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        myNum = scanner.nextInt();
        int rest = (myNum % 2);
        System.out.println("Is this number even?");
        String isThisNumberEven = rest == 0 ? "Yes, it is even." : "No, it is not even.";
        System.out.print(isThisNumberEven);

    }
}
