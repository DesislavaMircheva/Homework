package lecture8;

import java.util.Scanner;

public class Lecture8VowelsAndConsonants {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter letters: ");
        String input = scan.next();

        boolean vowels = input.equalsIgnoreCase("a")
                || input.equalsIgnoreCase("o")
                || input.equalsIgnoreCase("e")
                || input.equalsIgnoreCase("i")
                || input.equalsIgnoreCase("U");
        if((input.isEmpty()) || (input.length()>1)){
            System.out.println("Error.");
        }else if(!input.matches("[a-zA-Z]+")){
            System.out.println("Error. Not a letter.");
        }else if(vowels){
            System.out.println("Vowel.");
        }else{
            System.out.println("Consonant.");
        }

    }
}
