import java.util.Random;
class RandomClassHelpers{
    public static void main(String[] args){
        Random r1 = new Random();

        // This gives any numbers in Integer range 
        int randomNumber1 = r1.nextInt();

        // This takes a maxium range as input and gives from that like 
        // e.g nextInt(100) - 0 to 99
        int randomNumber2 = r1.nextInt(100);

        System.out.println(randomNumber1);
        System.out.println(randomNumber2);   
  
    }
}