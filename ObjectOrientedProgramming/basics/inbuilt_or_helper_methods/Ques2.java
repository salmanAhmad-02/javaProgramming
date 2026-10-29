import java.util.Random;
class Ques2{
    public static void main(String[] args){
        Random r1 = new Random();

        int min = 10;
        // Here only 2 digit , not more neither less (if generated num is in between 0 to 9 , adding 10 will make that two digits).
        int onlyTwoDigits = min + r1.nextInt(90);

        System.out.println("Two Digit Number : "+onlyTwoDigits);
    }
}