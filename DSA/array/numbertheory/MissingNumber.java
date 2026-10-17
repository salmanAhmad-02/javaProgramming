// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
class MissingNumber{
    public static int findMissingElement(int[] arr){
        if( arr == null || arr.length==0){
            return 0;
        }
        //Sum of Numbers from [0 to n] by Gauss's Sum Formula
        int expectedSum=arr.length*(arr.length+1)/2;
        int actualSum=0;
        for(int n:arr){
            actualSum += n;
        }
        return expectedSum-actualSum;
    }
    public static void main(String[] args){
        int[] nums={9,6,4,2,3,5,7,0,1};
        System.out.println("Missing Number is : "+findMissingElement(nums));
    }
}