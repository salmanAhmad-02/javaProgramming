package catching;

public class ArrayExample{
    public static void printElementsInRange(int[] arr, int start, int end){
        try{
            for(int i = start ; i < end; i++){
                System.out.println(arr[i]);
            }
        }
        catch(NullPointerException ex){
            System.out.println(ex);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
    }
}
