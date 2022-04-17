package lecture7;

import java.util.Scanner;

public class Lecture7Homework5 {
    public static void main(String[] args){
        //Напишете програма, която при въвеждане на число от 1 до 12 отпечатва месеца
        //в годината… Ако потребителят въведе нещо различно, отпечатайте „Invalid”
        //Помните ли как използвахме оператора switch, за да отпечатаме дните от седмицата?
        int month;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the month:");
        month = scan.nextInt();

        switch(month) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Invalid.");
        }
    }
}
