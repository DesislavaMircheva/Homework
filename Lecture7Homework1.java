package lecture7;

import java.util.Scanner;

public class Lecture7Homework1 {
    //Напишете програма SpringSeason, в която дефинирате 2 int променливи - month &
    //day. Програмата трябва да отпечатва true ако денят е между 20ти Март
    //(включително) и 20ти Юни (включително) и false в противен случай. Булева
    //стойност на израза ? „yes” : “false”
    //Пренапишете вашата програма, като използвате Scanner (за месеца и деня) и IF –
    //ELSE, вместо „?:“

    public static void main(String[] args) {
        int month;
        int day;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter month:");
        month = scan.nextInt();
        System.out.println("Please enter day:");
        day = scan.nextInt();


        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
            System.out.println("It is spring season");
        } else {
            System.out.println("It is not spring season");
        }
    }
}

