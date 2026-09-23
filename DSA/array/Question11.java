// Print sum of all elements divisible by 3.
class Question11{
    public static boolean isDivisibleByThree(int n){
        return n%3==0;
    }
    public static void printSumOfElementDivisibleByThree(int[] arr){
        int sum=0;
        for(int n:arr){
            if(isDivisibleByThree(n)){
                sum +=n;
            }
        }
        System.out.println("Sum Of Elements Divisible By 3 is : "+sum);
    }
    public static void main(String[] args){
        int[] nums={4, 72, 8, 305, 1492, 9, 81, 7063, 402, 9810};
        printSumOfElementDivisibleByThree(nums);
    }
}