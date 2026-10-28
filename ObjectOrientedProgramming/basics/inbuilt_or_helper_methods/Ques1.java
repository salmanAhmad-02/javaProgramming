import java.util.Random;
class Ques1{
    public static void main(String[] args){
        Random r1 = new Random();

        int oneDigitNum = r1.nextInt(10);

        System.out.println("One Digit Number : "+oneDigitNum);
    }
}