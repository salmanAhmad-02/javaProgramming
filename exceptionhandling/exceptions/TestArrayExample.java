package exceptions;

public class TestArrayExample {
    public static void main(String[] args) {
        System.out.println("Main Starts ..........");

        // Leads to a NullPointerException , in case of array object refrence , null is passed        
        // ExampleOnArray.printElementsInRange((null, 0, 6);

        int[] a ={76, 67, 45, 34};

        //this will lead ArrayIndexOutOfBoundExcetion , becasue the range boundary is beyond size.
        ExampleOnArray.printElementsInRange(a, 0, 7);

        //this will lead ArrayIndexOutOfBoundExcetion , becasue the range start from -1 but index starts from 0.
        //ExampleOnArray.printElementsInRange(a, -1, 7);

        System.out.println("Main Ends ..........");
    }
}
