package custom1;

public class AddNumbers{
    public static  int sum(int x, int y) throws NegativeInputException{
        if( x < 0 || y < 0){
            throw new NegativeInputException("Entered Negeative Inputs");
        }
        return x+y;
    }
}