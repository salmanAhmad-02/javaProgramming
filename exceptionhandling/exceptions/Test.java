package exceptions;

public class Test {
    public static void main(String[] args) {
        System.out.println("Main Starts ..........");

        // Program crash for input divisor 0, and remaining will not be eexecuted.
        int qsnt = ExceptionExample.devide(700,0 );
        System.out.println(qsnt);

        System.out.println("Main Ends ..........");
    }
}
