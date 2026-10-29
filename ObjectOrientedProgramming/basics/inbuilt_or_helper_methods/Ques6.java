// Six Digit OTP.
import java.util.Random;
class Ques6{
    public static void main(String[] args){
        Random r1 = new Random();


        int minRange = 100000;
        int maxRange = 900000;
        int sixDigits = minRange + r1.nextInt(maxRange - minRange);

        System.out.println("Six Digit OTP : "+sixDigits);
    }
}