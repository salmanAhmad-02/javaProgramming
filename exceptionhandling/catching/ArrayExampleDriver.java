package catching;


public class ArrayExampleDriver {
    public static void main(String[] args) {
        System.out.println("Main Starts ..........");
        int[] a ={76, 67, 45, 34};

        
        // ArrayExample.printElementsInRange(a, -1, 4);
        // ArrayExample.printElementsInRange(null, 0, 5);

        ArrayExample.printElementsInRange(a, 0, 2);

        System.out.println("Main Ends ..........");
    }
}
