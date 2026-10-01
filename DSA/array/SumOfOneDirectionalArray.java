/*
    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
    Return the running sum of nums.

    Example 1:
    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]
    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
*/
class SumOfOneDirectionalArray{
    public static int[] runningSum(int[] nums) {
        int[] sum=new int[nums.length];
        int sumAtPosition=0;
        for(int i=0; i<nums.length; i++){
            sumAtPosition += nums[i];
            sum[i] = sumAtPosition;
        }
        return sum;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4};
        int[] result=runningSum(nums);

        for(int n:result){
            System.out.print(n+" ");
        }
    }
}