// Print Average of all elements from array.
class Question7{
    public static void printArrayAvg(int[] arr){
        int sum=0;
        for(int n:arr){
            sum +=n;
        }
        double avg = (double)sum/arr.length;
        System.out.println("Average of all elements from array is : "+avg);
    }
    public static void main(String[] args){
        int[] nums={4, 72, 8, 305, 1492, 9, 81, 7063, 402, 9810};
        printArrayAvg(nums);
    }
}