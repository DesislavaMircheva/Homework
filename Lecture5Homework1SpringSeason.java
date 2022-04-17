package lecture5;

public class Lecture5Homework1SpringSeason {
    //Напишете програма SpringSeason, в която дефинирате 2 int
    //променливи - month & day. Програмата трябва да отпечатва true
    //ако денят е между 20ти Март (включително) и 20ти Юни
    //(включително) и false в противен случай. Булева стойност на израза
    //? „yes” : “false”
    public static void main(String[] args){
        int month = 6;
        int day = 21;
        boolean isItSpringSeason = ((month==3 && day>=20) || (month==6 && day<=20) || (month>3 && month<6));
        System.out.print(isItSpringSeason);
    }
}
