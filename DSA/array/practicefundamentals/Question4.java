// Access all elements of array from end
class Question4{
    public static void printArrayInReverse(int[] arr){
        System.out.println("Array Elements Form End : ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] nums={42, 7, 88, 19, 34, 91, 12, 53, 60, 26};
        printArrayInReverse(nums);
        
    }
}