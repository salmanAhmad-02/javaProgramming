/*
    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
    Return the running sum of nums.

    Example 1:
    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]
    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
*/
class SumOfOneDirectionalArray{
    //return new array uses O(n) Space Complexity
    public static int[] getrunningSum(int[] nums) {
        int[] sum=new int[nums.length];
        int sumAtPosition=0;
        for(int i=0; i<nums.length; i++){
            sumAtPosition += nums[i];
            sum[i] = sumAtPosition;
        }
        return sum;
    }
    // This version just simply modify the existing array, works in O(1) Space Complexity
    public int[] runningSum(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4};
        int[] result=getrunningSum(nums);

        for(int n:result){
            System.out.print(n+" ");
        }
    }
}