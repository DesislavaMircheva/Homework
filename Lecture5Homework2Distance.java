package lecture5;
public class Lecture5Homework2Distance {
    //Напишете програма Distance, която изчислява разстоянието от
//точка (x,y) до (0,0) по формулата//
    public static void main(String[] args){
        int x = 6;
        int y = 8;
        double result;
        result = Math.sqrt((x*=x)+(y*=y));
        System.out.print(result);
    }
}
