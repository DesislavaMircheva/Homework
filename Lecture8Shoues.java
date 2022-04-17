package lecture8;

import java.util.Scanner;

public class Lecture8Shoues {
    public static void main(String[] args){
        int size;
        float price;
        String colour;
        String canReturn;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size:");
        size = scan.nextInt();
        System.out.println("Enter price:");
        price = scan.nextFloat();
        System.out.println("Enter colour:");
        colour = scan.next();
        System.out.println("Return availability - Y/N");
        canReturn = scan.next();


        if((size == 44 || size == 45) && (price <= 150) && (!colour.equalsIgnoreCase("black")) && (canReturn.equalsIgnoreCase("Y"))){
            System.out.println("These are your shoes!");
        } else {
            System.out.println("These are not your shoes.");
        }
    }
}
