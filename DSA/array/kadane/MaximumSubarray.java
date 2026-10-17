/* Given an integer array nums, find the subarray with the largest sum, and return its sum.
    Example : 
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: The subarray [4,-1,2,1] has the largest sum 6.
*/
class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int currentSum=nums[0], maxSum=nums[0];
        for(int i=1; i<nums.length; i++){
            currentSum=Math.max(nums[i], currentSum + nums[i]);
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Result : "+maxSubArray(nums));
    }
}