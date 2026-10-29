import java.util.Random;
class Ques3{
    public static void main(String[] args){
        Random r1 = new Random();

        int min = 100;
        // Here only 3 digit , not more neither less.
        int onlyThreeDigits = min + r1.nextInt(900);

        System.out.println("Three Digit Number : "+onlyThreeDigits);
    }
}