package lecture8;

import java.util.Scanner;

public class Lecture8LeapYear {
    public static void main(String[] args){
        double year;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the year: ");
        year = scan.nextDouble();

        if(((year % 4) ==0) && (((year % 100 != 0)) || ((year % 400 == 0)))){
            System.out.println("29 Feb");
        } else {
            System.out.println("Not 29 Feb");
        }

    }
}
