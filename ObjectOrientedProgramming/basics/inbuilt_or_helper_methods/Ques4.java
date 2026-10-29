// Random number in a range.
import java.util.Random;
class Ques4{
    public static void main(String[] args){
        Random r1 = new Random();


        // Random number in range 100 to 2000
        int min = 100;
        int max = 2000;
        /* 
        either this way - where we are comparing and taking maximum in case of generated number is less than 100.
        int number = Math.max(100, r1.nextInt(2001)); 
        */

        int number = min + r1.nextInt(max - min);

        System.out.println("Random Number In Range "+ min +" to "+ max +"  is : "+number);
    }
}