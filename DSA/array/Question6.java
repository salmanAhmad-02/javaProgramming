// Print sum of all elements from array.
class Question6{
    public static void printArraySum(int[] arr){
        int sum=0;
        for(int n:arr){
            sum += n;
        }
        System.out.println("Sum of All Elements of Array is :"+sum);
    }
    public static void main(String[] args){
        int[] nums={4, 72, 8, 305, 1492, 9, 81, 7063, 402, 9810};
        printArraySum(nums);

    }        

}