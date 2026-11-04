package cathing;


public class DivideExample {

    //VERSION 1: returns 0 on failure (misleading)

    // public static int divide(int dividend, int divisor){
    //     int quotient = 0;                    // default value
    //     try {
    //         quotient = dividend / divisor;   // throws if divisor == 0
    //     }
    //     catch (ArithmeticException ex){
    //         System.out.println(ex);          // quotient stays 0
    //     }
    //     return quotient;
    // }

    /*
        divide(10, 20) -> 0  valid (0.5 truncated)
        divide(10, 0)  -> 0  WRONG: error hidden as a valid-looking 0
        MIN_VALUE / -1 -> overflow, no exception, wrong result 
    */

    // VERSION 2: returns null on failure (better, caller must check)
    public static Integer divide(int dividend, int divisor)throws NullPointerException{
        
        try{
            return dividend/divisor;
        }
        catch(ArithmeticException ex){
            System.out.println(ex);
            return null;
        }
    }   

    /*
        divide(10, 20) -> 0     valid (0.5 truncated)
        divide(10, 0)  -> null  failure
        int r = divide(10, 0); -> NullPointerException (unboxing null)
        MIN_VALUE / -1 -> overflow, no exception, wrong result
    */
}
