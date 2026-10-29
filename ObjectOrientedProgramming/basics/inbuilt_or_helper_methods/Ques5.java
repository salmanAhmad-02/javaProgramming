// Four Digit OTP.
import java.util.Random;
class Ques5{
    public static void main(String[] args){
        Random r1 = new Random();


        int minRange = 1000;
        int maxRange = 9000;
        int fourDigits = minRange + r1.nextInt(maxRange - minRange);

        System.out.println("Four Digit OTP : "+fourDigits);
    }
}