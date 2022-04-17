package leture6;

import java.util.Scanner;

public class Lecture6Homework1 {
    public static void main(String[] args){
//*Напишете програма, която чете едно число от конзолата, изчислява му корен квадратен и отпечатва резултата на екрана, с точност до 5-я знак след запетаята//
        int myNum;
        System.out.println("Enter your number:");
        Scanner scanner = new Scanner(System.in);
        myNum = scanner.nextInt();

        double myDouble = Math.sqrt(myNum);
        System.out.printf("%.5f", myDouble);

    }
}
