package custom1;

public class AddDriver {
    public static void main(String[] args) {
        System.out.println("Main Start........");
        try {
            System.out.println(AddNumbers.sum(89, -98));
        } catch (NegativeInputException e){
            // this will print caller statck
            e.printStackTrace();
        }
        System.out.println("Main Ends...........");
    }
}
