package lecture5;

public class Lecture5Homework3BMIIndex {
    public static void main(String[] args){
        double mass = 67;
        double height = 1.65;
        double bmiIndex = mass/ Math.pow(height,2);
        boolean amIFit = bmiIndex>=18.5 && bmiIndex<= 24.9 ? true : false;
       System.out.println(bmiIndex);
        System.out.print(amIFit);

    }
}
